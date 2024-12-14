import java.util.LinkedList;
import java.util.Queue;

public class _368lca {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    // this function check the given node is present in the tree or not : 
    public static boolean iscontain(Node root , Node node){
        if(root == null){
            return false;
        }

        if (root == node ) {
            return true;
        }
      return   iscontain(root.left, node) || iscontain(root.right, node);

    }
    public static Node lca(Node root , Node p , Node q){
        // agar dono node equal to to koi sa bhi return kar do : 
        if(p == q){
            return p;
        }
        // agar dono me se ek bhi node root ke barabar hai to root hi lca hoga : 
        if(p == root || q == root){
            return root;
        }

        // let p prenent on left subtree 
        // let q present on right subtree 
        boolean leftp = iscontain(root.left , p);
        boolean rightq = iscontain(root.right , q);

        // if p resent on left subtree
        // q present on right subtree 
        // then root is the lca : 
        if (leftp && rightq) {
            return root;  
        }

        // if q present on left subtree 
        // p present on right subtree 
        // then root is the lca : 
        if(!leftp && !rightq){
            return root;
        }

        // agar dono node right subtree me present karthe hai
        // to call laga do right subtree par : 
        if(!leftp && rightq){
            lca(root.right, p, q);
        }

        // agar dono node left subtree me present karte hai 
        // to call laga do left subtree par : 
        if(leftp && !rightq){
            lca(root.left , p , q);
        }

        // return kar do lca : 
        return root;
         
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
        String arr[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , "" , "7" , "" , "" , "8" , "" , "" , "9" , ""};
        Node root = construct(arr);

        Node ans = lca(root, root.left, root.right);
        System.out.println(ans.data);
        
    }
    
}
