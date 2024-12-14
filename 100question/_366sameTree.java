import java.util.LinkedList;
import java.util.Queue;

public class _366sameTree {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static boolean same(Node root1 , Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
         if(root1.data != root2.data){
            return false;
         }
        return same(root1.left, root2.left) && same(root1.right, root2.right);
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
        String arr1[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "" , "7" , "" , "" , "8" , "" , "" , "9" , ""};
        Node root1 = construct(arr1);
        
        String arr2[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "" , "7" , "" , "" , "8" , "" , "" , "9" , ""};
        Node root2 = construct(arr2);


        boolean same = same(root1, root2);
        System.out.println("two tree are same or not = " + same);

        
    }
    
}
