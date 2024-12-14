import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _460Magician_chocolates {
    public static int maxCholoate(int a , int arr[]){

        // we use the max heap : 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // add the element in priority queue : 
        for(int element : arr){
            pq.add(element);
        }

        // create a varaible which contain the max chocolate eat : 
        int max_chocolate_eat = 0;

        // traverse on the loop insertion and deletion : 
        while(a != 0 && pq.size() != 0){
            max_chocolate_eat += pq.peek();

            // add the half of the maximum : 
            pq.add(pq.peek()/2);

            // remove the maximum : 
            pq.remove();

            // decrease the timer : 
            a--;

        }

        // return the max chocolate eat : 
        return max_chocolate_eat;
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
        System.out.println("enter the timer : ");
        int time = sc.nextInt();

        int max_chocolate_eat = maxCholoate(time, arr);
        System.out.println(max_chocolate_eat);
        
    }

    
}
