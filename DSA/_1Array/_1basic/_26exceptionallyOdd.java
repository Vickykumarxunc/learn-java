import java.util.Scanner;

public class _26exceptionallyOdd {

    public static int getOddOccurances(int arr[] , int n){
        int ans = 0;

        for(int i = 0; i<n; i++){
            ans = ans ^ arr[i];
        }
        return ans;
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

        int ans = getOddOccurances(arr, n);
        System.out.println(ans);
    }
    
}
