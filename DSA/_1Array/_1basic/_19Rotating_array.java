import java.util.Scanner;

public class _19Rotating_array {
    
    public static void leftRotate(int arr[] , int k ){
        int n = arr.length;
        k = k % n;

        reverse(arr , 0 , k - 1);
        reverse(arr , k , n - 1);
        reverse(arr , 0 , n - 1);
    }
    public static void reverse(int arr[] , int left , int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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

        System.out.println("enter the rotation time : ");
        int k = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        leftRotate(arr , k);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
