import java.util.Scanner;

public class _8rotate_array_by_one {
    
    public static void rotate_by_one(int arr[]){

        int n = arr.length;
        int last_element = arr[n - 1];

        for(int i = n - 1; i>0; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = last_element;
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

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        rotate_by_one(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
