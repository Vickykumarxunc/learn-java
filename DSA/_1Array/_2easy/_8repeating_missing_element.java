import java.util.Scanner;

public class _8repeating_missing_element {
    public static int[] repeating_missing(int arr[] , int n){
        int ans[] = new int[2];

        int repeating_element = -1;
        int missing_element = -1;

        // first find the repeating element ;
        // mai current element ke index ka element check karuga 
        // agar vo positive hai to use negative bana duga : 
        // agar current element ke index ka element negative hai to current element hi repeated element hai : 
        for(int i = 0; i<n; i++){
            int index = Math.abs(arr[i]) - 1;

            if(arr[index] > 0){
                arr[index] = -1 * arr[index];
            }
            else{
                repeating_element = Math.abs(arr[i]);
            }
        }

        // now find the missing element ; 
        // jis index ka element positive hoga vohi element missing hai 
        for(int i = 0; i<n; i++){
            if(arr[i] > 0){
                missing_element = i + 1;
                break;
            }
        }
        ans[0] = repeating_element;
        ans[1] = missing_element;

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

        int ans[] = repeating_missing(arr, n);
        System.out.println("repeating element is = " + ans[0]);
        System.out.println("missing element is = " + ans[1]);

    }
}
