import java.util.PriorityQueue;
import java.util.Scanner;

public class _469Kthlargestelement_inStream {

    public static int[]  klargest(int arr[] , int k ){

        // create a min heap : 
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // create a ans array 
        // jiske ander hame k-1 tak -1 store karan hai : 
        // aur apne min heap me value ko bhi add karana hai : 
        int ans[] = new int[arr.length];

        for(int i = 0; i<k - 1; i++){
            ans[i] = -1;
            pq.add(arr[i]);
        }

        // now find the kth largest elment : 
        for(int i = k - 1; i<arr.length; i++){

            // first add the kth elment in min heap 
            pq.add(i);

            // agar heap ka size k se bada ho jaye to size ko decreae kar do : 
            if(pq.size() > k){
                pq.remove();
            }
            // agar heap ka size k hai to kth largest element nikal kar ans array me put kar do : 
            ans[i] = pq.peek();
        }

        // return the ans array ; 
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

        System.out.println("enter the value of k ");
        int k = sc.nextInt();

        int ans[] = klargest(arr, k);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        
    }
    
}
