import java.util.Scanner;

public class _6binaryArray_sorting {
    public static void binarySort(int arr[]){
        int n = arr.length;

        int k =0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 1){
                arr[k++] = 0;
            }
        }
        while(k != n){
            arr[k++] = 1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        binarySort(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]  + " ");
        }
        
    }
    
    
}
