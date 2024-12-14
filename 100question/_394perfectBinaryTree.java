// first find the height of the tree which is used for as a level : 
// agar root.left null hai or root.right null hai to return kar do false : 
// agar mai leaf node par chala gaya to check karo agar current leavel mere level ke barabar hai to return karo true : 
// same work do for left subtree and right sub tree : 

import java.util.LinkedList;
import java.util.Queue;

public class _394perfectBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    // first find the height of tree : 
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
    }

    // check the our tree is perfect or not : 
    public static boolean isperfectTree(Node root , int level , int current_level){
        if (root == null) {
            return true;
        }

        // agar me leaf node par pahuch gaya to check karo 
        // ki sari leaf node same level par present hai ya nahi  :
        if(root.left == null && root.right == null){
            if(current_level == level){
                return true;
            }
        } 
        // if root has only one node then return false: 
        if(root.left == null || root.right == null){
            return false;
        }
        // check for left and right subtree : 
        return isperfectTree(root.left, level, current_level + 1) && 
               isperfectTree(root.right, level, current_level + 1);

    }
    // main function : 
    public static boolean isPerfect(Node root){
        int level = height(root) + 1;

        boolean ans = isperfectTree(root , level , 1); // one is the current level : which start from the one : 
        
        return ans;
    }

    public static Node construct(String arr[]){
               int n = arr.length;
               int x = Integer.parseInt(arr[0]);
               Node root = new Node(x);
                Queue<Node> q = new LinkedList<>();
               q.add(root);
               int i = 1;
        
               while (i < n - 1){
                   Node left = new Node(0);
                   Node right = new Node(0);
                   Node temp = q.remove();
        
                   if (arr[i].equals("")){
                       left = null;
                   }
                   else
                   {
                       int l = Integer.parseInt(arr[i]);
                       left.data  = l;
                       q.add(left);
                   }
                   if (arr[i + 1].equals("")){
                       right = null;
                   }
                   else
                   {
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
        String arr[] = {"7" , "4" , "9"};
        Node root = construct(arr);

        boolean ans = isPerfect(root);
        System.out.println("tree is perfect tree or not = " + ans);

        
    }
    
}
