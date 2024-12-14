import java.util.Scanner;

public class _35game_with_nos {
    public static int[] game_with_nos(int arr[] , int n){
        int x;
        for(int i = 0; i<n - 1; i++){
            x = arr[i] ^ arr[i + 1];
            arr[i] = x;
        }
        return arr;
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

        int ans[] = game_with_nos(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}
