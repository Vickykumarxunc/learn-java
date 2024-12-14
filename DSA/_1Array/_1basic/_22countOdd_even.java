import java.util.Scanner;

public class _22countOdd_even {
    public static int[] countOddEven(int arr[]){
        int odd_count = 0;
        int even_count = 0;

        int ans[] = new int[2];
        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i] % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        ans[0] = odd_count;
        ans[1] = even_count;

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

        int ans[] = countOddEven(arr);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
