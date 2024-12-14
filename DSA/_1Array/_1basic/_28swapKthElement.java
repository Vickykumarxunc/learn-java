import java.util.Scanner;

public class _28swapKthElement {
    public static void swapKth(int arr[] , int k){
        int n = arr.length;

        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;


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
        System.out.println("enter k swap element : ");
        int k = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        swapKth(arr, k);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
