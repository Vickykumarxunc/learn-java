import java.util.Scanner;

public class _1search_element_inArray {

    public static int search(int arr[] , int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }  
        }
        return -1;
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

        int ans = search(arr, 3);
        System.out.println(ans);
        
    }
    
}
