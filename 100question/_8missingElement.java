import java.util.Scanner;

public class _8missingElement {
    public static int missing(int arr[]){
        int n = arr.length;

        // first find sum of total element : 
        int totalElement = (n * (n  + 1))/2;
        int array_sum = 0;
      
        // now find the sum of array element : 
        for(int i = 0; i<n - 1; i++){
            array_sum += arr[i];
        }

        return (totalElement - array_sum);
         

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

        int missing_element = missing(arr);

        System.out.println("missing element is = " + missing_element);
        
    }
    
}
