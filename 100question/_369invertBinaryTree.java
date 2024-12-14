import java.util.LinkedList;
import java.util.Queue;

public class _369invertBinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void invert(Node root) {
        if (root == null) {
            return;
        }

        // phle root ke left right ko swap kar do :
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // left subtree ko swap kar do : aur root ke left me jod do
        invert(root.left);

        // right subtree ko swap kar do : aur root ke right ke jod do :
        invert(root.right);

        
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

    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        String arr[] = { "1", "2", "3", "4", "5", "", "6", "", "7", "", "", "8", "", "", "9", "" };
        Node root = construct(arr);

        preorder(root);
        invert(root);

        
        System.out.println();
        preorder(root);


    }

}
