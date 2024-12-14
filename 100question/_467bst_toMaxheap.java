import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _467bst_toMaxheap {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    
    public static void inorder(Node root , ArrayList<Integer> list){
        // base case 
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    public static void postorder(Node root , ArrayList<Integer> list , int index[]){
        // base case : 
        if(root == null){
            return;
        }
        postorder(root.left, list, index);
        postorder(root.right, list, index);
        root.data = list.get(index[0]);
        index[0]++;
    }
    public static void convert_maxheap(Node root){

        // base case : 
        if(root == null){
            return;
        }

        // first find the preorder : 
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root , list);

        // change the node data by the postorder : 
        int index[] = new int[]{0};
        postorder(root , list , index);
    }

    // construc the tree ; 
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
                q.add(temp.left);
            }
            if(arr[i + 1].equals("")){
                right = null;
            }
            else{
                int r = Integer.parseInt(arr[i + 1]);
                right.data = r;
                q.add(temp.right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

// print the tree : 
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        String arr[] = {"4" , "2" , "6" , "1" , "3" , "5" , "7"};
        Node root = construct(arr);
        preorder(root);


    }
    
}
