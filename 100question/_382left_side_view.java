import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _382left_side_view {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // calculate the height : 
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
    }

    // reverse preorder : 
    public static void preorder(Node root , ArrayList<Integer> list , int level){
        if(root == null){
            return;
        }
        list.set(level - 1, root.data);
        preorder(root.right, list, level + 1);
        preorder(root.left, list, level + 1);
    }
    // left view function : 
    public static ArrayList<Integer> left_view(Node root){
        
        // create a array list of the size of level : 
        ArrayList<Integer> list = new ArrayList<>();

        // find the level of the tree : 
        int level = height(root) + 1;

        // fill the any element in arraylist : 
        for(int i = 0; i<level; i++){
            list.add(0);
        }

        // apply  reverse preorder : 
        preorder(root , list , 1);

        // return the list : 
        return list;
    }

    // construct tree ; 
    public static Node construct(String arr[]){
               int n = arr.length;
               int x = Integer.parseInt(arr[0]);
               Node root = new Node(x);
               Queue<Node> q = new LinkedList<>();
                q.add(root);
                int i = 1;
        
                while (i < n - 1){
                    Node temp = q.remove();
                    Node left = new Node(0);
                    Node right = new Node(0);
        
                    if (arr[i].equals("")){
                        left = null;
                    }
                    else
                    {
                        int l = Integer.parseInt(arr[i]);
                        left.data = l;
                        q.add(left);
                    }
                    if (arr[i+1].equals("")){
                        right = null;
                    }
                    else {
                        int r = Integer.parseInt(arr[i + 1]);
                        right.data = r;
                        q.add(right);
                    }
                    temp.left = left;
                    temp.right  = right;
                    i += 2;
                }
                return root;
            }
    public static void main(String[] args) {
        String arr[] = {"1" , "2" ,  "3" , "" , "5" , "" , "4"};
        Node root = construct(arr);

        List<Integer> ans = left_view(root);
        System.out.println(ans);
        
    }
    
}
