import java.util.Scanner;

public class _7binarySearch {
    public static int find_index(int arr[] , int target , int n){
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while(low <= high){

            mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;

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
        System.out.println("enter the target element : ");
        int target = sc.nextInt();

        int ans = find_index(arr, target , n);
        System.out.println("index of the finding element is = " + ans);
    }
}
