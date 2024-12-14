import java.util.Scanner;

public class _39balanceArray {
    public static int minValuetoBalance(int arr[] , int n){
        // array length always even : 
        int mid = n/2;
        int left_sum = 0;
        int right_sum = 0; 

        for(int i = 0; i<mid; i++){
            left_sum += arr[i];
        }
        for(int i = mid; i<n; i++){
            right_sum += arr[i];
        }

        return Math.abs(left_sum - right_sum);
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

        int ans = minValuetoBalance(arr, n);
        System.out.println("minimum value required to make array balanced = " + ans);


    }
}
