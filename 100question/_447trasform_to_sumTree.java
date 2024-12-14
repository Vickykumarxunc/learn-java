import java.util.LinkedList;
import java.util.Queue;

public class _447trasform_to_sumTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static int get_sum(Node root){
        // base case 
        if(root == null){
            return 0;
        }
        // agar mai leaf node par pahuch gaya 
        // phle leaf node ke data ko store karo : 
        // fir uske data ko zero kar do : 
        // return kar do uska data : 
        if(root.left == null && root.right == null){
        int temp = root.data;
        root.data = 0;
        return temp;
        }

        // get the left subtree sum and right subtree sum : 
        int left_sum = get_sum(root.left);
        int right_sum = get_sum(root.right);

        //phel mai jis node par hoon us node ka data store karuga : 
        // fir uske data me left_sum + right_sum kar duga : 
        int temp = root.data;
        root.data = left_sum + right_sum;

        // pir mai us node ke parent no ko uska previous and update data return kar duga :
        return temp + root.data;


    }
    
    public static void sumTree(Node root){
        if(root == null){
            return;
        }
        // creaeate a function which provide the tree sum : 
        get_sum(root);
    }

    // construct the tree .......................
    public static Node construct(String arr[]){
               int n = arr.length;
               int x = Integer.parseInt(arr[0]);
               Queue<Node> q = new LinkedList<>();
               Node root  = new Node(x);
               q.add(root);
               int i = 1;
        
               while (i < n - 1){
                   Node temp = q.remove();
                   Node left = new Node(0);
                   Node right  = new Node(0);
        
                   if (arr[i].equals("")){
                       left = null;
                   }
                   else
                   {
                       int l = Integer.parseInt(arr[i]);
                       left.data = l;
                       q.add(left);
                   }
                   if (arr[i + 1].equals("")){
                       right = null;
                   }
                   else {
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

           // print the tree ...............
           public static void preorder(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
           }
    public static void main(String[] args) {
        String arr[] = {"10" , "-2" , "6" , "8" , "-4" , "7" , "5"};
        Node root = construct(arr);
       preorder(root);

       System.out.println();
       
       sumTree(root);
       preorder(root);


        
    }
    
}
