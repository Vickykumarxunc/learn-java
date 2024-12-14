import java.util.Scanner;

public class _5largest_element_inArray {
    public static int largest(int arr[] , int n){

        int max = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
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

        int ans = largest(arr, n);
        System.out.println(ans);
    }
    
}
