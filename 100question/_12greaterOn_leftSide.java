import java.util.Scanner;

public class _12greaterOn_leftSide {
    public static void greaterLeft(int arr[]){
        int n = arr.length;

        int current_greater = arr[0];

        arr[0] = -1;

        for(int i = 1; i<n; i++){
            if(arr[i] > current_greater){

                int temp = arr[i];
                arr[i] = current_greater;
                current_greater = temp;
            }
            else{
                arr[i] = current_greater;
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

       greaterLeft(arr);
       for(int i = 0; i<n; i++){
        System.out.print(arr[i] +" ");
       }
        
    }
    
}
