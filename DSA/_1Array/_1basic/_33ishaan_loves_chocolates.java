import java.util.Scanner;

public class _33ishaan_loves_chocolates {
    
    public static int chocolates(int arr[]){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
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

        int ans = chocolates(arr);
        System.out.println(ans);
    }
    
}
