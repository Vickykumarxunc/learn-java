import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class _455bottomViewOfbinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static class Pair{
        int hd;
        Node node;
        Pair(int hd , Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    public static ArrayList<Integer> bottomView(Node root){
        Map<Integer , Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0 , root));

        while(q.size() != 0){
            Pair curr = q.remove();

            map.put(curr.hd , curr.node.data);

            if(curr.node.left != null){
                q.add(new Pair( curr.hd - 1 , curr.node.left));
            }
            if(curr.node.right != null){
                q.add( new Pair(curr.hd + 1 , curr.node.right));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }

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

        ArrayList<Integer> list = bottomView(root);
        System.out.println(list);
        
    }
    
}
