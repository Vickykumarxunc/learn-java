import java.util.Scanner;

public class _40first_1_ina_sorted_binary_array {
 
    public static int first_index(int arr[]){
        int n = arr.length;

        // use the binary search on the array 0 , 0 , 0 , 0 ,  1 , 1 , 1 : 
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while(start <= end){
            
            int mid = start + (end - start)/2;

            if(arr[mid] == 1){

                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
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

        int ans = first_index(arr);
        System.out.println("index of the first 1 is = " + ans);
    }
 }