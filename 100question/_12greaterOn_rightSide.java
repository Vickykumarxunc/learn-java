import java.util.ArrayList;
import java.util.Scanner;

public class _12greaterOn_rightSide {
    public static void rightGreater(int arr[])
    {
        int n = arr.length;

        // make a varaible which store the current greater element :
        // let the last element of the array is greater element : 
        int current_greater = arr[n - 1];

        // put the -1 at the end of the array kyoki array ke right side me koi or element nahi hai : 
        arr[n - 1] = -1;

        // traverse from the right side : 
        for(int i = n - 2; i>= 0; i--){
 
            // means mujhe or element mil gaya
            // to swap kar do current greater ko aur arr[i] :
            // at this moment current_greater element is updated :  
            if(arr[i] > current_greater){

                int temp = arr[i];
                arr[i] = current_greater;
                current_greater = temp;

            }
            // iska matlab hai ki ab tak ka greater element current_greater hi hai : 
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

     rightGreater(arr);
     for(int i = 0; i<n; i++){
        System.out.print(arr[i] + " ");
     }
        

    }
    
}
