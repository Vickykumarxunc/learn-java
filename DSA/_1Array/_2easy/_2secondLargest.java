import java.util.Scanner;

public class _2secondLargest {
    public static int second_largest(int arr[] , int n){
        int max1 = -1;
        int max2 = max1;

        for(int i = 0; i<n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            if(arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }
        return max2;
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

        int ans = second_largest(arr, n);
        System.out.println("second largest element = " + ans);

    }
}
