import java.util.Scanner;

public class _20SumOfArray {
    public static int Array_sum(int arr[]){
        int n = arr.length;
        int sum  = 0;

        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        return sum;
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

        int ans = Array_sum(arr);
        System.out.println("sum of the array is = " + ans);

    }
    
}
