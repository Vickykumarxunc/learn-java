import java.util.Scanner;

public class _15search_aNumber {
    public static int search(int arr[] , int k){

        int n = arr.length; 
        for(int i = 0; i<n; i++){
            if(arr[i] == k){

                return i + 1;
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

        System.out.println("enter the search element : ");
        int k = sc.nextInt();
        int ans = search(arr , k);
        System.out.println(ans);

    }
}
