import java.util.Scanner;

public class _44fightingTheDarkness {

    // candle kitne din chalegi : 
    public static int NoOfDays(int arr[]){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
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

        int ans = NoOfDays(arr);
        System.out.println("no of days room will stay illuminated = " + ans);
        
    }
}
