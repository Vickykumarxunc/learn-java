import java.util.Scanner;

// equilibrium point -> the equilibrium point in an array is an index  or position such that 
// the sum of all element before the index is the same as the sum of element after it : 
public class _16equilibriumPoint {
    public static int equilibrium(int arr[]){

        int n  = arr.length;
        // first find the total sum : this is the right sum : 
        int total_sum = 0;
        for(int i = 0; i<n; i++){
            total_sum += arr[i];
        }

    // maintain the left sum : 
    int left_sum = 0;
    int right_sum = total_sum;

    for(int i = 0; i<n; i++){
         right_sum -= arr[i];

         if(right_sum == left_sum){
            return i + 1; // position : 
         }
         left_sum += arr[i]; // we maintain the left sum : 
    }

    return -1;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array : ");
       int n  = sc.nextInt();

       int arr[] = new int[n];
       System.out.println("enter the array element : ");
       for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
       }

       int ans = equilibrium(arr);
       System.out.println(ans);
    }
    
}
