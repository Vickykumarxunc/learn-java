import java.util.LinkedList;
import java.util.Queue;

public class _371zig_zag_levelOrderTraversal {
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

    public static void nthlevel1(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.data + " ");
        }
        nthlevel1(root.left, n - 1);
        nthlevel1(root.right, n - 1);
    }

    public static void nthlevel2(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.data + " ");
        }
        nthlevel2(root.right, n - 1);
        nthlevel2(root.left, n - 1);
    }

    public static void zig_zag(Node root) {

        int level = height(root) + 1;
        for (int i = 1; i <= level; i++) {
            if (i % 2 != 0) {
                nthlevel1(root, i);
            } else {
                nthlevel2(root, i);
            }
        }

    }

    public static Node construct(String arr[]) {
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
         Queue<Node> q = new LinkedList<>();
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
        String arr[] = { "1", "2", "3", "4", "5", "", "6", "", "7", "", "", "8", "", "", "9", "" };
        Node root = construct(arr);

        zig_zag(root);

    }

}
