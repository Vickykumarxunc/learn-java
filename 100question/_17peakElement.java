// peak element - > if its value is greater than or equal to the value of its adjacent element (left and right)
// first and last element always peak : 

import java.util.Scanner;

public class _17peakElement {
    public static int peak(int arr[]){
        int n = arr.length;

        // we use the binary search : 
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while(low <= high){
            mid = (low + high)/2;

            // at this condition we get our answe : 
            if((mid == 0 || arr[mid] >= arr[mid - 1]) &&(mid == n - 1 || arr[mid] >= arr[mid + 1]) ){
                break;
            }

            // agar mera mid pichle element se hi chota hai 
            // to vo aage ke saare element se chota hoga 
            // so high = mid - 1; 
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array : ");
       int n  = sc.nextInt();

       int arr[] = new int[n];
       System.out.println("enter the array element : ");
       for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
       }

       int ans = peak(arr);
       System.out.println(ans);
        
    }
    
}
