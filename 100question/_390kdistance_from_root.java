import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _390kdistance_from_root {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void nthlevelElement(Node root , ArrayList<Integer> ans , int n){
        if(root == null){
            return;
        }
        if(n == 0){
            ans.add(root.data);
            return;
        }
        nthlevelElement(root.left, ans, n - 1);
        nthlevelElement(root.right, ans, n - 1);

    }
    public static ArrayList<Integer> kdistance(Node root , int k){
        ArrayList<Integer> ans = new ArrayList<>();
        nthlevelElement(root , ans , k);

        return ans;
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
        String arr[] = {"5" , "4" , "8" , "11" , "" , "13" , "4" , "7" , "2" , "" , "" , "5" , "1" };
        Node root = construct(arr);

        ArrayList<Integer> list = kdistance(root, 2);
        System.out.println(list);
        
    }
    
}
