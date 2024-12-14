import java.util.Scanner;

public class _6equilibriumPoint {
    public static int equilibriumPoint(int arr[]  , int n){
        int total_sum = 0;

        for(int i = 0; i<n; i++){
            total_sum += arr[i];
        }

        int left_sum = 0;
        int right_sum = total_sum;

        for(int i = 0; i<n; i++){
            left_sum += arr[i];

            if(left_sum == right_sum){
                return i + 1;
            }
            else{
                right_sum -= arr[i];
            }
        }
        return -1;
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

        int ans = equilibriumPoint(arr, n);
        System.out.println("equilibrium point is = " + ans);
    }
}
