import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class _385Node_without_sibling {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static ArrayList<Integer> noSibling(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        // make a function which provide the ans : 
        getsibling(root ,  ans);

        // sort the list : 
        Collections.sort(ans);

        if(ans.size() == 0){
            ans.add(-1);
        }
        // return ans;
        return ans;
    }

    public static void getsibling(Node root , ArrayList<Integer> list){
        if(root == null){
            return;
        }
        // if we reach at the end of the tree : 
        if(root.left == null && root.right == null){
            return;
        }
        // means root ke paas ek hi child hai: 
        if(root.left == null){
            list.add(root.right.data);
        }
        // means root ke paas ek hi child hai : 
        if (root.right == null) {
            list.add(root.left.data);   
        }

        // traverse the tree: 
        getsibling(root.left, list);
        getsibling(root.right, list);
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

        ArrayList<Integer> list = noSibling(root);
        System.out.println(list);
        
    }
    
}
