import java.util.HashSet;
import java.util.Scanner;

public class _56sumOfDistinctElement {
    public static int findSum(int arr[] , int n ){
        int sum = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){

            if(!set.contains(arr[i])){
                sum += arr[i];
                set.add(arr[i]);
            }
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

        int ans  = findSum(arr, n);
        System.out.println("sum of the distinct element = " + ans);
        
    }
}
