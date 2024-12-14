import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _393LargestValueInEachLevel {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data  = data;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void nthlevel(Node root , int n , int arr[]){
        if(root == null){
            return;
        }
        if (n == 1) {
            if(root.data > arr[0]){
                arr[0] = root.data;
                return;
            }
        }
        nthlevel(root.left, n - 1, arr);
        nthlevel(root.right, n - 1, arr);
    }
    public static ArrayList<Integer> largestValue(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        // if my tree is empty  : return empty list : 
        if(root == null){
            return ans;
        }

        // fint the level of the tree : 
        int level = height(root) + 1;

        // find the largest value in each level : 
        for(int i = 1; i<=level; i++){
            int arr[] = {Integer.MIN_VALUE};
            nthlevel(root , i , arr);
           ans.add(arr[0]);
        }
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
        String arr[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "" , "7" , "" , "" , "8" , "" , "" , "9" , ""};
        Node root = construct(arr);

        ArrayList<Integer> ans = largestValue(root);
        System.out.println(ans);
    }
    
}
