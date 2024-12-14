import java.util.Scanner;

public class _1peak_element{

    public static int peakElement(int arr[] , int n ){

        // use the binary search 
        int start = 0;
        int end = n - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])){
                return mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return 0;
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

        int ans = peakElement(arr, n);
        System.out.println(ans);

    }
}