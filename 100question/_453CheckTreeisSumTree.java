import java.util.LinkedList;
import java.util.Queue;

public class _453CheckTreeisSumTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean sumTree(Node root){
        // create a helper function : 
        return find_sum(root) != -1;
    }
    public static int find_sum(Node root){
        
        // if root == null consider as a sum tree : 
        if(root == null ){
            return 0;
        }

        // agar mai leaf node par pahuch gaya hoon 
        // to leaf node ka data return kar do : 
        if(root.left == null && root.right == null){
            return root.data;
        }

        // traverse on the tree postorder : 
        // fint the sum of left subtree and right subtree : 
        int left_sum = find_sum(root.left);
        int right_sum = find_sum(root.right);

        // check the root ke vlaue : 
        if(root.data == left_sum + right_sum){
            return right_sum + left_sum + root.data; // for the parent node : 
        }
        // agar root ki value left subtree + right subtree ke barabar nahi hai to return kar do -1: 
        // this is not a sum tree : 
        else{
            return -1;
        }
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
        String arr[] = {"3" , "1" , "2"};
        Node root = construct(arr);

        boolean ans = sumTree(root);
        System.out.println("tree is sum tree or not = " + ans);
        
    }
    
}
