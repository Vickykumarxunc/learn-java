import java.util.Arrays;
import java.util.Scanner;

public class _47segregateEven_oddNumber {
    public static void segregateEvenOdd(int arr[] , int n){

        
        // take a two pointer : 
        int left = 0;
        int right = n - 1;

        while(left < right){

            while(left < right && arr[left] % 2 == 0){
                left++; // no changes : 
            }
            while(left < right && arr[right] % 2 != 0){
                right--; // no changest : 
            }

            // if odd and even element are not in correct position : 
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            int evenEnd = left;

            Arrays.sort(arr , 0 , evenEnd); // sort the even number : 
            Arrays.sort(arr , evenEnd , n); // sort the odd number : 
            
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

         segregateEvenOdd(arr, n);
         for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
         }
    }
}
