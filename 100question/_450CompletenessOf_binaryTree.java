import java.util.LinkedList;
import java.util.Queue;

public class _450CompletenessOf_binaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // we use the level order traversal : using the queue (bfs)
    public static boolean isCompleteBT(Node root){

        // base case -> empty tree is always a complte tree : 
        if(root == null){
            return true;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        // we maintain a flag to check the left and right of the node : 
        // mai root node ke left right jane se phle apane boolean flag ko check karuga 
        // agar flag = true hai to tree complete tree nahi hai to return kar do false : 
        boolean flag = false;

        while(q.size() != 0){
            Node temp_node = q.remove();

            // check for the left subtree >
            if(temp_node.left != null){

                // first check the flag : 
                if(flag == true){
                    return flag; // tree complete nahi hai: 
                }

                q.add(temp_node.left);
            }
            else{
                flag = true; // if temp_node ka left == null hai : 
            }

            // check for the right node : 
            if(temp_node.right != null){
                
                // first chech the flag : 
                if(flag == true){
                    return false;
                }

                q.add(temp_node.right);
            }
            else{
                flag = true;
            }
        }

        // return the ans : 
        return flag; 
    }

    // construct the tree : 
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
        String arr[] = {"1" , "2" , "3" , "" , "4"};
        Node root = construct(arr);

        boolean ans = isCompleteBT(root);
        System.out.println("tree is complete tree or not = " + ans);

        
    }
    
}
