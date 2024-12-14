import java.util.Arrays;
import java.util.Scanner;

public class _45AlternatedSorting {

    public static int[] AlternatedSorting(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];

        // first sort the array : 
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        int k = 0;

        while(i <= j){
            if(k < n){
            ans[k++] = arr[j]; // largest : 
            }
            if(k < n){
            ans[k++] = arr[i]; // smallest :
            } 
            i++;
            j--;
            
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

        int ans[] = AlternatedSorting(arr);
        for(int i = 0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
