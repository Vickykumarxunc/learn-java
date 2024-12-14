import java.util.Scanner;

public class _43maximumProductOfTwoNumber {
    public static int maxProduct(int arr[]){
        
        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;

        for(int i = 0; i<n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] < max1 && arr[i] > max2){
                max2 = arr[i];
            }
        }
        int product = max1 * max2;
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

        int ans = maxProduct(arr);
        System.out.println("max product of two number = " + ans);
        
    }
}
