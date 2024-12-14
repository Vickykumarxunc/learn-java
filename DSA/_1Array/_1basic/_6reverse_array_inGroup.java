import java.util.ArrayList;
import java.util.Scanner;

public class _6reverse_array_inGroup {
    public static void reverseInGroup(int arr[] , int n , int k){
        
        for(int i = 0; i<n; i += k){

            int left = i;
            int right = Math.min(k + i - 1 , n - 1);

            while (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
   
            }
        }
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
        System.out.println("enter the length of group : ");
        int k = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverseInGroup(arr, n, k);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
