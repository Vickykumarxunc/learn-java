import java.util.HashSet;
import java.util.Scanner;

public class _61make_a_distinct_digit_array {

    public static int[] common_digit(int arr[] , int n ){

        // we use the hashSet : 
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            int num = arr[i];

            while (num != 0) {
                int rem = num % 10;
                set.add(rem);
                num = num/10;
            }
        }

        int ans[] = new int[set.size()];
        int i = 0;
        for(int element : set){
            ans[i++] = element;

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

        int ans[] = common_digit(arr, n);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}
