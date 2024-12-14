import java.util.Arrays;
import java.util.Scanner;

public class _36AtLeastTwoGreaterNumber {

    // hame array return karna hai except two greater element : 
    public static int[] findElements(int arr[]){
        // first sort the array : 
        Arrays.sort(arr);
        int n = arr.length;

        int ans[] = new int[n - 2];
        for(int i = 0; i<ans.length; i++){
            ans[i] = arr[i];
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
        int ans[] = findElements(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");

        }
    }
    
}
