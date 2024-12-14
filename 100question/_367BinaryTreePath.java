import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _367BinaryTreePath {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void create_path(Node root , ArrayList<String> list  , String str){
    if(root == null){
        return;
    }
    if(root.left == null && root.right == null){
        str += root.data;
        list.add(str);
    }
    create_path(root.left, list, str + root.data + "->");
    create_path(root.right, list, str + root.data + "->");

    }
    public static ArrayList<String> root_to_leaf_path(Node root){
        ArrayList<String> ans = new ArrayList<>();
         create_path(root, ans, "");
        return ans;
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

        ArrayList<String> ans = root_to_leaf_path(root);
        System.out.println(ans);

        
    }
    
}
