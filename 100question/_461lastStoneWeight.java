import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _461lastStoneWeight {

    public static int last_stone_weight(int arr[]){
        int n = arr.length;

        // create a max heap : 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // add the element in priority queue : 
        for(int element : arr){
            pq.add(element);
        }

        int weight = 0;
        while(pq.size() > 1){
            
            int first_stone = pq.remove();
            int second_stone = pq.remove();

            weight = first_stone - second_stone;

            if(weight != 0){
                pq.add(weight);
            }
        }

        return pq.isEmpty() ? 0 :  pq.peek();
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

        int last_stone_weight = last_stone_weight(arr);
        System.out.println("last stone weight is = " + last_stone_weight);
        
    }
    
}
