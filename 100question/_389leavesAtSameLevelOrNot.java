import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class _389leavesAtSameLevelOrNot {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    // we use the hash set
    // if all leaves node present at same level
    // then size of the hashset is one because hashset not hold the duplicate value
    // :

    // if all leaves node are not present at same level
    // the size of the hash set greater than one :

    public static boolean check(Node root) {

        // create a Hashset :
        HashSet<Integer> set = new HashSet<>();

        // create a helper function :
        return getlevel(root, set, 1);
    }

    public static boolean getlevel(Node root, HashSet<Integer> set, int level) {
        // zero node tree :
        if (root == null) {
            return true;
        }

        // go to the end of the tree :
        if (root.left == null && root.right == null) {
            set.add(level);
        }
        // check in left and right subtree :
        // and increase the level by one :
        getlevel(root.left, set, level + 1);
        getlevel(root.right, set, level + 1);

        // if the size of the set is 1 return true else return false ;
        return set.size() == 1;
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

        boolean ans = check(root);
        System.out.println("all leaves is present the same level or not = " + ans);

    }

}
