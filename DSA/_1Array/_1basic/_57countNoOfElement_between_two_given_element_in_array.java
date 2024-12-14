import java.util.Scanner;

public class _57countNoOfElement_between_two_given_element_in_array {

    public static int getCount(int arr[] , int num1 , int num2 , int n ){

        // first find the left most index of num1 from the left side : 
        int left_index = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == num1){
                left_index = i;
                break;
            }
        }

        // second find the right most index of num2 from the right side : 
        int right_index = -1;
        for(int i = n - 1; i>= 0; i--){
            if(arr[i] == num2){
                right_index = i;
                break;
            }
        }
         // agar given element array me present na ho : 
         if(left_index == -1 || right_index == -1 || left_index >= right_index){
            return 0;
         }

         // return the total no of element between the given two element : 
         int ans = right_index - left_index - 1;
         return ans; 
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
        System.out.println("enter the two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = getCount(arr, num1, num2, n);
        System.out.println("total no of element between the two number = " + ans);
        
    }
}
