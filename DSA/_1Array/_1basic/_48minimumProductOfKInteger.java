import java.util.Arrays;
import java.util.Scanner;

public class _48minimumProductOfKInteger {
    public static int product(int arr[] , int k ){
        int n = arr.length;
        int product = 1;

        // first sort the array : 
        Arrays.sort(arr);
        for(int i = 0; i<k; i++){
            product *= arr[i];
        }
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
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        int ans = product(arr, k);
        System.out.println(ans);
    }
}
