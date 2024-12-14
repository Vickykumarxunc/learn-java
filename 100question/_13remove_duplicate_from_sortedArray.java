import java.util.Scanner;

public class _13remove_duplicate_from_sortedArray {
    public static int remove_duplicate(int arr[]){
        int n = arr.length;

        // create a one varaible it check the duplicacy : 
        // j aage tabhi move karege jab i and j different hoge  : 
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        // size of the new array : after removing the duplicate element : 
        return j + 1; // 1 add due to zero based indexing : 
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

       int new_size = remove_duplicate(arr);
       for(int i = 0; i<new_size; i++){
        System.out.print(arr[i] + " ");
       }

       
        
    }
    
}
