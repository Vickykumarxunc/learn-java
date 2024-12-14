import java.util.Scanner;

public class _458heightofheap {
    public static int height(int arr[]){
        int n  = arr.length;

        int height = 0;

        // array ke size ko kitni baar divide karu ki 1 aa jaye vahi uski height hogi : 
        while(n != 0){
            height++;
            n = n/2;
        }
        return height;
    }
    public static void main(String[] args) {
         System.out.println("enter the size of the array : ");
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int height = height(arr);
        System.out.println("height of the heap = " + height);
        
    }
    
}
