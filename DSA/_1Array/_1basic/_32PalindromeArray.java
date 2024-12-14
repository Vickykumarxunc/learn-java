import java.util.Scanner;

public class _32PalindromeArray {
    public static boolean isPalindrome(int arr[]){
        int n = arr.length;

        for(int i = 0; i<n/2; i++){
            if(arr[i] != arr[n - i - 1]){
                return false;
            }
        }
        return true;
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

        boolean ans = isPalindrome(arr);
        System.out.println("array is palindrome or not = " + ans);
    }
}
