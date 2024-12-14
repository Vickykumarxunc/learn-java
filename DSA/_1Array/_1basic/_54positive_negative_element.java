import java.util.ArrayList;
import java.util.Scanner;

public class _54positive_negative_element {
    public static ArrayList<Integer> positive_negative(int arr[] , int n ){

        int helper[] = new int[n];
        int j = 0;
        int k = 1;

        for(int i = 0; i<n; i++){
            if(arr[i] >= 0){
                helper[j] = arr[i];
                j += 2;
            }
            if(arr[i] < 0){
                helper[k] = arr[i];
                k += 2;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int element : helper){
             ans.add(element);
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

        ArrayList<Integer> ans = positive_negative(arr, n);
        System.out.println(ans);
    }
}
