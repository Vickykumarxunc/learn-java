import java.util.LinkedList;
import java.util.Queue;

public class _381count_non_leaves {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int count(Node root) {

        if (root == null) {
            return 0;
        }
        // condition of leaf node :
        if (root.left == null && root.right == null) {
            return 0;
        }

        // if non leaf node :
        return 1 + count(root.left) + count(root.right);

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

        int count = count(root);
        System.out.println(count);

    }

}
