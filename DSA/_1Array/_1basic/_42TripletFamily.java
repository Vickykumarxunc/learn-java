import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _42TripletFamily {
    // keval ek triplet find karna hai : 
    public static ArrayList<Integer> findTriplet( int arr[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        // first sort the array : 
        Arrays.sort(arr);
        int n = arr.length;
        
        // traverse the array from the right side : 
        for(int i = n - 1; i>= 2; i--){

            int left = 0;
            int right = i - 1;

            while(left < right){
                
                if(arr[left] + arr[right] == arr[i]){
                    list.add(arr[left]);
                    list.add(arr[right]);
                    list.add(arr[i]);
                    return list;
                }
                else if(arr[left] + arr[right] < arr[i]){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

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

        ArrayList<Integer> ans = findTriplet(arr);
        System.out.println(ans);
    }
}
