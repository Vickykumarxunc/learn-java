/*
 full binary tree -> binary tree in which all nodes have either zero or two child nodes. 
 1. if a binary tree node is null then is a full binary tree : 
 2. if a binary tree node does have emtpy left and right subtree then it is a full binary tree by defination . 
 3. recursively check if the left and right subtree are also binary trees them selves : 

 4. in all other combinations of right and left sub-tree the binary is not a full binary tree : 
 */

import java.util.LinkedList;
import java.util.Queue;

public class _451check_full_binaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean isfullTree(Node root){
        // empty tree always a full binary tree : 
        if(root == null){
            return true;
        }

        // if have a leaf node : 
        if(root != null && root.left == null && root.right == null){
            return true;
        }

        // if both left and right subtree are not null
        // they are full 
        if(root.left != null && root.right != null){
            return isfullTree(root.left) &&
                   isfullTree(root.right);
        }

        // all other combinations not a full tree : 
        return false;
         
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
        String arr[] = {"1" , "2" , "3"};
        Node root = construct(arr);

        boolean ans = isfullTree(root);
        System.out.println("tree is full or not = " + ans);
        
    }
    
}
