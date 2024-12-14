import java.util.Scanner;

public class _3missing_element_inAp {
    public static int missingElement(int arr[]){
        int n = arr.length;

        int common_diff = (arr[n - 1] - arr[0] )/n;
        int low = 0;
        int high = n - 1;

        while(low < high){
            int mid = low + (high - low)/2;

            if(arr[mid] == arr[0] + common_diff * mid){
                low = mid + 1;
            }
            else{
                high = mid;
            }
            
        }
        return arr[0] +common_diff * low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans = missingElement(arr);
        System.out.println(ans);
        
    }
    
}
