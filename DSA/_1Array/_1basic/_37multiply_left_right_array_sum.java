import java.util.Scanner;

public class _37multiply_left_right_array_sum {
    public static int multiply(int arr[]){
        int left_sum = 0;
        int right_sum = 0;
        int product = 1;

        int n = arr.length;
        int mid = n/2;

        for(int i = 0; i<mid; i++){
            left_sum += arr[i];
        }
        for(int i = mid; i<n; i++){
            right_sum += arr[i];
        }
        product = left_sum * right_sum;
        return product;
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

        int ans = multiply(arr);
        System.out.println("multiply of right and left sum subarray = " + ans);
    }
}
