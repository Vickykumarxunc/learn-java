import java.util.Scanner;

public class _2array_search {
    public static int search(int arr[] , int n , int target){

        for(int i = 0; i<n; i++){
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

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the search element");
        int target = sc.nextInt();

        int ans = search(arr, n, target);
        System.out.println(ans);

        
    }
}
