import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class _388reverseLevelOrderTraversal {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static ArrayList<Integer> reverse_level_order(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        // apply the level order traveral
        // order of the traverse is reverse
        // first add root ke right ka data
        // second add root ke left ka data :

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.size() != 0) {
            Node temp = q.remove();

            // store the first right Node:
            if (temp.right != null) {
                q.add(temp.right);
            }
            // store the left Node :
            if (temp.left != null) {
                q.add(temp.left);
            }
            // add the ans in list :
            list.add(temp.data);

        }

        // after that reverse the list :
        Collections.reverse(list);

        // return the ans :
        return list;
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

        ArrayList<Integer> list = reverse_level_order(root);
        System.out.println(list);

    }

}
