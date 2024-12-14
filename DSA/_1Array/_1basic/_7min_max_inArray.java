import java.util.Scanner;
 
 
public class _7min_max_inArray {
    public static int[] getMinMax(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int ans[] = new int[2];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        ans[0] = min;
        ans[1] = max;

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

        int ans[] = getMinMax(arr);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}
