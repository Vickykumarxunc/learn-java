import java.util.Scanner;

public class _59longest_increasing_subarray {
    public static int lenOfLongestIncSubarray(int arr[] , int n){
        int length = 1;
        int max_length = Integer.MIN_VALUE;

        for(int i = 1; i<n; i++){
            if(arr[i] > arr[i - 1]){
                length++;
            }
            else{
                length = 1;
            }
            if(length > max_length){
                max_length = length;
            }
        }
        return max_length;
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
        int ans = lenOfLongestIncSubarray(arr, n);
        System.out.println("length of longest increasing subarray = " + ans);
    }
}
