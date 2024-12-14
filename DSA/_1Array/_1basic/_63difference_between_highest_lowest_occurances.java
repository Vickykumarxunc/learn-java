import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _63difference_between_highest_lowest_occurances {
    public static int findDiff(int arr[] , int n){

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i] , 1);
            }
            else{
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
         
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            max = Math.max(max , entry.getValue());
            min = Math.min(min , entry.getValue());

        }
        return max - min;
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

        int ans = findDiff(arr, n);
        System.out.println("difference between highest and lowerst occurances = " + ans);
    }
}
