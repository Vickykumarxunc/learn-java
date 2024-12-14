import java.util.LinkedList;
import java.util.Queue;

public class _364diameterOf_bt {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        int mid = height(root.left) + height(root.right);

        if(root.left != null){
            mid++;
        }
        if(root.right != null){
            mid++;
        }

        return Math.max(left , Math.max(right , mid));
    }

    //  String arr[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "" , "7" , "" , "" , "8" , "" , "" , "9" , ""};
    Node root = construct(arr);    public static void main(String[] args) {
        String arr[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "" , "7" , "" , "" , "8" , "" , "" , "9" , ""};
        Node root = construct(arr);

        int diameter = diameter(root);
        System.out.println("diameter of the tree is = " + diameter);
        
    }
    
}
