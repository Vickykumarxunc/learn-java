import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.event.ListDataEvent;

public class _363DFS {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void dfs(Node root){
        if(root == null){
            return;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);

        while(st.size() != 0){
            Node temp = st.peek();

            if(temp.left != null){
                st.push(temp.left);
                temp.left = null;
            }
             else{
                st.pop();
                System.out.print(temp.data + " ");
                if (temp.right != null) {
                    st.push(temp.right);
                    
                }
             }
            
        }

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

        dfs(root);

        
    }
    
}
