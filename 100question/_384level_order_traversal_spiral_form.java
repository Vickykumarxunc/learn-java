import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _384level_order_traversal_spiral_form {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;

        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void nthlevel1(Node root, ArrayList<Integer> list, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            list.add(root.data);
        }
        nthlevel1(root.left, list, n - 1);
        nthlevel1(root.right, list, n - 1);
    }

    public static void nthelvel2(Node root, ArrayList<Integer> list, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            list.add(root.data);
        }
        nthelvel2(root.right, list, n - 1);
        nthelvel2(root.left, list, n - 1);
    }

    public static ArrayList<Integer> spiral(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        int level = height(root) + 1;

        for (int i = 0; i <= level; i++) {

            // for odd level -> right to left :
            if (i % 2 != 0) {
                nthelvel2(root, ans, i);
            }

            // for even level -> left to right :
            else {
                nthlevel1(root, ans, i);

            }
        }
        return ans;
    }

    public static Node construct(String arr[]) {
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(x);
        q.add(root);
        int i = 1;

        while (i < n - 1) {
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);

            if (arr[i].equals("")) {
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.data = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) {
                right = null;
            } else {
                int r = Integer.parseInt(arr[i + 1]);
                right.data = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

    public static void main(String[] args) {
        String arr[] = { "5", "4", "8", "11", "", "13", "4", "7", "2", "", "", "5", "1" };
        Node root = construct(arr);

        ArrayList<Integer> ans = spiral(root);
        System.out.println(ans);

    }

}
