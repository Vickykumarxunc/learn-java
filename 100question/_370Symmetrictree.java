import java.util.LinkedList;
import java.util.Queue;

public class _370Symmetrictree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static boolean sameTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }

        return sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
    }

    public static Node invert(Node root) {
        if (root == null) {
            return root;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        root.left = invert(root.left);
        root.right = invert(root.right);

        return root;
    }

    public static boolean symmetric(Node root) {
        // zero node ka tree always symmetric hota hai :
        if (root == null) {
            return true;
        }

        // first invert the any subtree leftsubtree or right subtree :
        root.left = invert(root.left);

        // check two tree is same or not :
        return sameTree(root.left, root.right);
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

        boolean ans = symmetric(root);

        System.out.println("is tree is symmetric or not = " + ans);

    }

}
