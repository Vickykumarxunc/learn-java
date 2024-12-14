import java.util.Scanner;

public class _7move_negative_element_atEnd {
    public static void segregateElement(int arr[]){
        int n = arr.length;

        // create a helper array : 
        int helper[] = new int[n];
        int k = 0;

        // first push the positive element : 
        for(int i = 0; i<n; i++){
            if(arr[i] >= 0){
                helper[k++] = arr[i];
            }
            
        }
        // second push the negative element : 
        for(int i = 0; i<n; i++){
            if(arr[i] < 0){
                helper[k++] = arr[i];
            }
        }

        // now copy the ans into original arry : 
        for(int i = 0; i<n; i++){
            arr[i] = helper[i];
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

        segregateElement(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
