import java.util.LinkedList;
import java.util.Queue;

public class _376pathSum1 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean haspathSum(Node root, int target) {
        if (root == null) {
            return false;
        }

        // agar mai tree par traverse karte karte leaf node par pahuch gaya
        // to check kar ki root.data equal hai ya nai target se
        if (root != null && root.left == null && root.right == null) {

            if (root.data == target) {
                return true;
            }
        }

        // aishe hi mai har ek node ke liye check karuga :
        // aur apane target ko root ke data se decrease karke pass karuga :
        return haspathSum(root.left, target - root.data) ||
                haspathSum(root.right, target - root.data);
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

        boolean ans = haspathSum(root, 8);
        System.out.println("target sum is present or not = " + ans);

    }

}
