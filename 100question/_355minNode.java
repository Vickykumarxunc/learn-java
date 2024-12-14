import java.util.LinkedList;
import java.util.Queue;

public class _355minNode {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static int min(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int a = root.data;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a , Math.min(b , c));
    }
    public static Node construct(String arr[]){
            int n = arr.length;
            int x = Integer.parseInt(arr[0]);
            Node root = new Node(x);
            Queue<Node> q = new LinkedList<>();
            q.add(root);
    
            int i = 1;
            while(i < n - 1){
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
                 i +=2;
            }
            return root;
        }
    public static void main(String[] args) {
        String arr[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "" , "7" , "" , "" , "8" , "" , "" , "9" , ""};
        Node root = construct(arr);
        int min = min(root);
        System.out.println("minimum value of the tree = " + min);
        
    }
    
}
