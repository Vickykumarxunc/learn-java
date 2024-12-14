import java.util.LinkedList;
import java.util.Queue;

import javax.naming.LimitExceededException;

public class _373boundaryTraversal_anticlockWise {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void left_boundary(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        // go to the left side : 
        if(root.left != null){
            left_boundary(root.left);
        }
        else{
            left_boundary(root.right);
        }
    }
    public static void botton_boundary(Node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
        botton_boundary(root.left);
        botton_boundary(root.right);
    }
    public static void right_boundary(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        if (root.right != null) {
            right_boundary(root.right);
        }
        else{
            right_boundary(root.left);
        }
    }
    public static void boundaryTraversal(Node root){
        if(root == null){
            return;
        }
        // for anticlock wise 
        //1 left boundary 
        left_boundary(root);
        // 2 bottom boundary 
        botton_boundary(root);
        //3 right boundary
        right_boundary(root.right);
    }

     public static Node construct(String arr[]){
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        int i = 1;

        while(i < n - 1){
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);

            if(arr[i].equals("")){
                left = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                left.data = l;
                q.add(left);
            }
            if(arr[i + 1].equals("")){
                right = null;
            }
            else{
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
        String arr[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "7" , ""  , "8" , ""  , "9" , "10",
        "" , "11" , "" , "12"  , ""  , "13" , "" , "14" , "15" , "16" , "" , "17" , "" , "" , "18" , "",
        "19" , "" , "" ,"" , "20" , "21" , "22" , "23" , "" , "24" , "25" , "26" ,"27" , "" , "" , "28" , "" , ""};

        Node root = construct(arr);
        boundaryTraversal(root);
    }
    
}
