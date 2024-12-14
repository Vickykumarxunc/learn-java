import java.util.Scanner;

public class _51type_of_Array {

    public static int type(int arr[]){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int type = 0;

        //* */ first find the max and min : 
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        //* now we are apply the cases :  */

        //* case 1 for ascending  */
        if(arr[0] == min && arr[n - 1] == max){
            type = 1;
        }

        //* case 2 for descending  */
        else if(arr[0] == max && arr[n - 1] == min){
            type = 2;
        }
    
        //* case 3 descending rotating array  */
        else if(arr[0] < arr[n - 1]){
            type = 3;
        }

        //* case 4 ascending rotating array  */
        else{
            type = 4;
        }

        return type;

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

        int ans = type(arr);
        System.out.println("what tha type of the array = " + ans);
    }

    /*
     * return 1 if the array is in ascending order : 
     * return 2 if the array is in descending order : 
     * return 3 if the array is in descending rotated order : 
     * return 4 if the array is in ascending rotated order : 
     */

}
