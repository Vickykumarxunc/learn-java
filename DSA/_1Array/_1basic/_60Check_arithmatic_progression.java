import java.util.Scanner;

public class _60Check_arithmatic_progression {
    public static boolean checkIsAP(int arr[] , int n){

        for(int i = 0; i<n - 1; i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }

        if(n <= 2){
            return true;
        }
        
        int common_difference = arr[1] - arr[0];
        for(int i = 1; i<n - 1; i++){
            if(arr[i + 1] - arr[i] != common_difference){
                return false;
            }
        }
        return true;

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

        boolean ans = checkIsAP(arr, n);
        System.out.println("given series formed ap or not = " + ans);

    }
}


// 0 12 4 8 

// it 1 -> 0 12 4 8
// it 2 -> 0 4 12 8 
// it 3 -> 0 4 8 12  it form a ap : 


// 12 40 11 20 

// it 1 -> 12 40 11 20 
// it 2 -> 12 11 40 20 
// it 3 -> 12 11 20 40 its not form a ap  


