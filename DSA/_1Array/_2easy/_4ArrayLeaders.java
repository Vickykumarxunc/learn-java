import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _4ArrayLeaders {
    public static ArrayList<Integer> leaders(int arr[] , int n){
        
        ArrayList<Integer> list = new ArrayList<>();
        int right_max = Integer.MIN_VALUE;

        for(int i = n - 1; i>= 0; i--){
            if(arr[i] >= right_max){
                list.add(arr[i]);
                right_max = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
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
        ArrayList<Integer> ans = leaders(arr, n);
        System.out.println(ans);
    }
}
