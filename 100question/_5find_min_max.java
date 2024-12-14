import java.util.Scanner;

public class _5find_min_max {
    public static void getminmax(int arr[] , int n )
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("maximum number is = " + max  + "minimum number is = " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("enter the array element :");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        getminmax(arr, arr.length);



        
    }
}
