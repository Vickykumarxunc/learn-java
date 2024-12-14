import java.util.LinkedList;
import java.util.Queue;

public class _383root_to_leaf_pathSum {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static int TreePathSum(Node root) {
        int sum = 0;
        return getSum(root, sum);
    }

    // this function determine the sum from root to path :
    public static int getSum(Node root, int sum) {
        if (root == null) {
            return 0;
        }
        // agar mai leaf node par pahuch gaya to mai apane preivous sum of update kar
        // duga :
        sum = sum * 10 + root.data;
        if (root.left == null && root.right == null) {
            return sum;
        }

        // sum of left subtree and right subtree:
        return getSum(root.left, sum) + getSum(root.right, sum);
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

        int sum = getSum(root, 0);
        System.out.println("sum from root to leaf path = " + sum);

    }

}
