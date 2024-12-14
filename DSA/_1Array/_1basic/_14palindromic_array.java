import java.util.Scanner;

public class _14palindromic_array {

    public static boolean palinArray(int arr[]){

        for(int i = 0; i<arr.length; i++){

            if(!ispalindrome(arr[i])){

                return false;
            }
        }
        return true;
    }

    public static boolean ispalindrome(int n){

        int rem = 0;
        int rev = 0;
        int m = n;

        while(m != 0){

            rem = m % 10;
            rev = rev * 10 + rem;
            m = m/10;
        }

        if(rev == n){
            return true;
        }
        return false;
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

        boolean ans = palinArray(arr);
        System.out.println(ans);

    }
    
}
