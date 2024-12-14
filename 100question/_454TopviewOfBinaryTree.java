import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

 /* top view of the binary tree : 
  1. use the tree hash map which store the value in sorted form by the key : 
  2. use the level order traversal with the help of queue which store the pair : 
  3. add the pair that is (horizontal distance , currNode) in the queue 
  4. if we go left side of the root decrease the horizontal distance by 1:
  5. if we go right side of the root increase the horizontal distance by 1:
  6. add in the queue : 

  7. after traverse on the map : and fill the ans in the array list : 
  8. finally return the ans array list : 
  */
public class _454TopviewOfBinaryTree {

    // this is the class of the binary tree : 
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // this is the class for new Pair :
    public static class Pair{
        int hd;
        Node node;
        Pair(int hd , Node node){
            this.hd = hd; // hd store the horizontal distance : 
            this.node = node; // it store the current node : 
        }
    }
    public static ArrayList<Integer> topView(Node root){
        
        // create a map ;
        Map<Integer , Integer> map = new TreeMap<>();

        // create a queue for traverse : 
        Queue<Pair> q = new LinkedList<>();

        // add the root node with horizontal distance that is 0 : 
        q.add(new Pair(0 , root));

        // traverse the tree : 
        while (q.size() != 0) {
        
            // top most pair of the queue ;
            Pair curr = q.remove();

            // fill the map : 
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd , curr.node.data);
            }

            // go to the left side : 
            if(curr.node.left != null){
                q.add(new Pair(curr.hd - 1 , curr.node.left));
            }

            // go to the right side : 
            if(curr.node.right != null){
                q.add(new Pair(curr.hd + 1 , curr.node.right));
            }
        }
        /// now traverse on the map : 
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        // return  the ans : 
        return list;
   
    }

    public static Node construct(String arr[]){
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (i < n - 1) {
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);

            if(arr[i].equals("")){
                left = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                left.data = l;
                q.add(left);
            }
            if(arr[i + 1].equals("")){
                right = null;
            }
            else{
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
            String arr[] = {"1" , "2" , "3" , "4" , "5" , "6" , "7"};
            Node root = construct(arr);

            ArrayList<Integer> list = topView(root);
            System.out.println(list);
        
    }
    
}
