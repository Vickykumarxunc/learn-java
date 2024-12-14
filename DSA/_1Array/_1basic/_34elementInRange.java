import java.util.Scanner;

public class _34elementInRange {
    public static boolean check_elements(int arr[] , int A , int B){
        int n = arr.length;

        // create a frequency array of size b : 
        int freq[] = new int[B + 1];

        // fill the frequency array : 
        for(int i = 0; i<n; i++){
            if(arr[i] >= A && arr[i] <= B){
                freq[arr[i]]++;
            }
        }
        // now traverse the frequncy array : 
        for(int i = A; i<= B; i++){
            if(freq[i] == 0){
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

        System.out.println("enter the range of element : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        boolean ans = check_elements(arr, A, B);
        System.out.println(ans);


    }
}
