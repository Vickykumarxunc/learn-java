import java.util.Scanner;

public class _17binaryArray_sorting {
    public static void binSort(int arr[]){
        int n = arr.length;
        
        int k = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 1){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k != n){
            arr[k] = 1;
            k++;
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

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        binSort(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
