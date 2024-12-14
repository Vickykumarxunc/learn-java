import java.util.LinkedList;
import java.util.Queue;

public class _379flattenALinkedlist {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void flatten(Node root){
        if(root == null ){
            return;
        }
        Node current = root;
        while(current != null){
            if(current.left != null){
                Node pred = current.left;

                while (pred.right != null && pred.right != current) {
                    pred = pred.right;
                }
                pred.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
        
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

           public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
           }
    public static void main(String[] args) {
        String arr[] = {"5" , "4" , "8" , "11" , "" , "13" , "4" , "7" , "2" , "" , "" , "5" , "1" };
        Node root = construct(arr);
        preorder(root);
        System.out.println();

        flatten(root);
        preorder(root);
        
    }
    
}
