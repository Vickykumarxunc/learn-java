import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _50remove_duplicate_element_fromUnsortedArray {
    
    public static int[] remove_duplicate(int arr[]){
        int n = arr.length;

        HashSet<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i<n; i++){
            
            set.add(arr[i]);
        }
        int i = 0;
        int ans[] = new int[set.size()];

        for(int element  : set){
            ans[i] = element;
            i++;
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

        int ans[] = remove_duplicate(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
