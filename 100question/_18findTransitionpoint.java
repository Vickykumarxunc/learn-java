// transition point -> the first index where 1 was obtained : 

import java.util.Scanner;

public class _18findTransitionpoint {
    public static int transition(int arr[]){
        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int mid = 0;
        int ans = -1;

        while (low <= high) {
             mid = (low + high)/2;

            if(arr[mid] == 0){
                low = mid + 1;
            }
            if(arr[mid] == 1 ){
                ans = mid;
                high = mid - 1;
            }

        }
        return ans;
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

       int ans = transition(arr);
       System.out.println(ans);
        
    }
    
}
