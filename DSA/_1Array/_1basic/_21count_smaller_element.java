import java.util.Scanner;

public class _21count_smaller_element {
    public static int count_smaller(int arr[] , int x){
        int count = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i] <= x){
                count++;
            }
        }
        return count;
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

        System.out.println("enter the x element : ");
        int x = sc.nextInt();
        int ans = count_smaller(arr, x);
        System.out.println(ans);

    }
}
