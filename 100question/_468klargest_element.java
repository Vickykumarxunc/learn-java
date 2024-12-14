import java.util.PriorityQueue;
import java.util.Scanner;

public class _468klargest_element {
    public static int[] klargest(int arr[] , int k ){

        // create a min heap : 
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add the element in priority Queue : 
        for(int i= 0; i<arr.length; i++){

            if(pq.size() == k){

                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
                // for incoming smallest element ke liye continue kardo : 
                continue;
            }
            // if heap size is less than k then add the element : 
            pq.add(arr[i]);
        }

        // create a ans array which store the k largest elment : 
        int ans[] = new int[k];
        for(int i = k- 1; i>= 0; i--){
            ans[i] = pq.remove();
        }

        // return the ans array : 
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of k : ");
        int k = sc.nextInt();

        int ans[] = klargest(arr, k);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        
    }
    
}
