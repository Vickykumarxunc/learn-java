import java.util.Scanner;

public class _15sort012 {
    public static void sort012(int arr[]){
        // by using the dutch national flag algorith : 
        int n = arr.length;
        
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (mid <= high) {

            // if arr[mid] == 0 
            // swap mid and low 
            // aur dono ko increase kar do : 
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            // if arr[mid] == 1: 
            // to sirf mid ko increase kar do : 
           else if(arr[mid] == 1){
                mid++;
            }
            // if arr[mid] == 2
            // to mid aur high ko swap kar do ; 
            // high ko decreaes kar do : 
           else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array : ");
       int n  = sc.nextInt();

       int arr[] = new int[n];
       System.out.println("enter the array element : ");
       for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
       }

       sort012(arr);
       for(int i = 0; i<n; i++){
        System.out.print(arr[i] + " ");
       }
        
    }
    
}
