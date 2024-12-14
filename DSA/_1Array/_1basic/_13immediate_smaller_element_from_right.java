import java.util.Scanner;

public class _13immediate_smaller_element_from_right {

    public static void immediateSmaller(int arr[]){
        int n = arr.length;

        for(int i = 0; i<n - 1; i++){
            
            if(arr[i] > arr[i + 1]){

                arr[i] = arr[i + 1]; 
            }
            else{

                arr[i] = -1;
            }

        }
        arr[n - 1] = -1;
        
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

    }


    // arr[] = [4 , 2 , 1 , 5 , 3 ]
    // output = [2 , 1 , -1 , 3 , -1]
    
}
