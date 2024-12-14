import java.util.HashMap;
import java.util.Scanner;

public class _9TwoSumPairWithgivenSum {
    public static int getPairSum(int arr[] , int k , int n){

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        int count = 0;
        for(int i = 0; i<n; i++){
            int y = arr[i];
            int x = k - y;

            if(map.containsKey(x)){
                map.put(arr[i] , map.get(arr[i]) - 1);
                count += map.get(x);
            }
        }
        return count;
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
    }
}
