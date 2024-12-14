import java.util.Scanner;

public class _4cyclic_rotateArray_byOne {
    public static void rotate(int arr[]){

        // length of the array : 
        int n = arr.length;

        // store the last element of the array :
        int last_element = arr[n - 1];

        // traverse from the last : 
        // shift the element right side one by one : 
        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        // fill the first position of the array by the last element : 
        arr[0] = last_element;
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

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rotate(arr);
        
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
