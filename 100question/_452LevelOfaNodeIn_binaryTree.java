import java.util.LinkedList;
import java.util.Queue;

public class _452LevelOfaNodeIn_binaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // method 1 by using the bfs : 
    public static int level_ofNode(Node root , int targert){
        
        int level = 1;

        if(root == null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.size() != 0) {
            int q_size = q.size();

            while(q_size-- != 0){
                Node temp = q.remove();

                if(temp.data == targert){
                    return level;
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            level++;  
        }
        return 0; // agar target tree me present nahi hai : 

    }

    // method 2 using recursing : 
    public static int getLevel(Node root , int target){
        int arr[] = new int[1];

        findLevel(root , target , arr , 1);
        return arr[0];
    }
    public static void findLevel(Node root , int target , int arr[] , int level){
        if(root == null ){
            return;
        }
        // agar root ka data target ke barabar hai 
        // to array me level fill kardo : 
        if(root.data == target){
            arr[0] = level;
        }

        // else traverse on the level 
        // check left and right subtree and increae the level: 
        findLevel(root.left, target, arr, level + 1);
        findLevel(root.right, target, arr, level + 1);


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
        String arr[] = {"3" , "2" , "5" , "1" , "4" , "" , ""};
        Node root = construct(arr);

        // from method 1 : 
        int Node_level = level_ofNode(root, 4);
        System.out.println(Node_level);

        // from method : 
        int Node_level2 = getLevel(root, 4);
        System.out.println(Node_level2);


    }
    
}
