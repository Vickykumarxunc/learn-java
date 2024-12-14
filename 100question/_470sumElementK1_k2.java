import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// sum of the element between k1 and k2 smallest element : 
public class _470sumElementK1_k2 {
    public static int sum_element(int arr[] , int k1 , int k2){

        // create a two max heap : 
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        // add the arr1 element in max heap 
        for(int i = 0; i<k1; i++){
            pq1.add(arr[i]);
        }

        // add the arr2 element in max heap : 
        for(int i = 0; i<k2 - 1; i++){
            pq2.add(arr[i]);
        }

        // find the k1 smallest element : 
        for(int i = k1; i<arr.length; i++){
            
            if(arr[i] < pq1.peek()){
                pq1.remove();
                pq1.add(arr[i]);
            }
        }

        // find the k2 smallest element : 
        for(int i = k2 - 1; i<arr.length; i++){

            if(arr[i] < pq2.peek()){
                pq2.remove();
                pq2.add(arr[i]);
            }
        }

        // find the sum k1 smallest element : 
        int k1_sum = 0;
        while(pq1.size() != 0){
            k1_sum += pq1.remove();
        }

        // find the sum k2 smallest element : 
        int k2_sum = 0;
        while(pq2.size() != 0){
            k2_sum += pq2.remove();
        }

        // now find the and 
        // by by substract the two min heap : 
        int sum = k2_sum - k1_sum;

        // return the and ; 
        return sum;
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

        System.out.println("enter the range of k1 and k2");
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();

        int ans = sum_element(arr, k1, k2);
        System.out.println("sum of element between k1 and k2 smallest element =" + ans);
        
        
    }
    
}
