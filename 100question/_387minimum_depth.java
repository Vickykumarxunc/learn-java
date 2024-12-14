import java.util.LinkedList;
import java.util.Queue;

public class _387minimum_depth {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static  int find_min_height(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + Math.min(find_min_height(root.left) , find_min_height(root.right));
    }

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
    public static void main(String[] args) {
        String arr[] = {"10" , "20" , "30" , "" , "40" , "" , "60" , "" , ""  , ""};
        Node root = construct(arr);

        int min_depth = find_min_height(root) + 1;
        System.out.println("min depth of the tree is = " + min_depth);
    }
    
}
