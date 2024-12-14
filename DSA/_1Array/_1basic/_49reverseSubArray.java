import java.util.Scanner;

public class _49reverseSubArray {
    public static void reverseSubArray(int arr[] , int l , int r)
    {
        int n = arr.length;
        int start = l - 1;
        int end = r - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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

        System.out.println("enter the range of sub array : ");
        int l = sc.nextInt();
        int r = sc.nextInt();
        reverseSubArray(arr, l, r);
        
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]  + " ");
        }
    }
}
