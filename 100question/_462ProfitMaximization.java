import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _462ProfitMaximization {
    public static int profit_maximization(int arr[] , int ticket){
        int n = arr.length;

        // use the max heap : 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // add the element in heap : 
        for(int element : arr){
            pq.add(element);
        }
        
        int max_profit = 0;
        while(ticket != 0 && pq.size() != 0){
            max_profit += pq.peek(); // this is the maximum element : 

            // mujhe maximum element me se 1 substract karke usko heap me add bhi karna hai : 
            if(pq.peek() - 1 != 0){
                pq.add(pq.peek() - 1);
            }
            // remove the maximum element : 
            pq.remove();

            // decrease the ticket : 
            ticket--;

        }
        return max_profit;
    }
    public static void main(String[] args) {
         System.out.println("enter the size of the array : ");
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the no of ticket : ");
        int ticket = sc.nextInt();

        int max_profit = profit_maximization(arr, ticket);
        System.out.println("maximum profit = " + max_profit);
        
    }
    
}
