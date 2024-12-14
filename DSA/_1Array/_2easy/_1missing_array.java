import java.util.Scanner;

public class _1missing_array{
    public static int missing_element(int arr[] , int n){

        int total_sum = ( (n + 1) * (n + 2) )/2;
        for(int i = 0; i<n; i++){
            total_sum -= arr[i];
        }
        int missing_element = total_sum;
        return missing_element;
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

        int ans = missing_element(arr, n);
        System.out.println("missing element in the array = " + ans);

    }
}