import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _374right_side_view {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // give the height of the tree :
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // create the ans ye level -1 par ans ko set kar dega
    // har call par mai apane level ko 1 se increase kar ke pass karuga :
    public static void preorder(Node root, ArrayList<Integer> list, int level) {
        if (root == null) {
            return;
        }
        list.set(level - 1, root.data);
        preorder(root.left, list, level + 1);
        preorder(root.right, list, level + 1);
    }

    // function to be right side view :
    public static ArrayList<Integer> rightView(Node root) {
        // create a empty array list which store the ans :
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        // first find the level :
        int level = height(root) + 1;

        // fill the array list by any no
        // here we fill by zero :
        // array list ka size level ke barabar hoga :
        for (int i = 0; i < level; i++) {
            list.add(0);
        }

        // call the function preorder :
        preorder(root, list, 1);

        // return the list :
        return list;

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
        String arr[] = {"1" , "2" ,  "3" , "" , "5" , "" , "4"};
        Node root = construct(arr);

        List<Integer> ans = rightView(root);
        System.out.println(ans);

    }

}
