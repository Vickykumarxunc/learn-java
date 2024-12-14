import java.util.PriorityQueue;
import java.util.Scanner;

public class _459MinCostOfRope {
    public static int min_cost(int arr[]){
       
        // use the min heap 
        // we can easily get the first and second minimum element ; 
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add the element in pq : 
        for(int element : arr){
            pq.add(element);
        }
        int min_cost = 0;

        while(pq.size() > 1){
            int firstRope = pq.remove();
            int secondRope = pq.remove();

            int cost = firstRope + secondRope;
            min_cost += cost;

            pq.add(cost);
        }
        return min_cost;
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

        int min_cost = min_cost(arr);
        System.out.println("minimum cost = " + min_cost);
        
    }
    
}
