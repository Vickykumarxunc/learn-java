import java.util.Scanner;

public class _24print_array_element {
    public static void print(int arr[]){
        int n = arr.length;

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
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

        print(arr);

    }
}
