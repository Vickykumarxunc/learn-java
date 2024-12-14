import java.util.HashMap;
import java.util.Scanner;

public class _58The_problem_of_identical_array {

    public static boolean isIdentical(int arr1[] , int arr2[] , int n , int m){
        if(n != m){
            return false;
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i] , 1);
            }
            else{
                map.put(arr1[i] , map.get(arr1[i]) + 1);
            }
        }

        for(int i = 0; i<m; i++){
            if(!map.containsKey(arr2[i]) || map.get(arr2[i]) == 0){
                return false;
            }
            else{
                map.put(arr2[i] , map.get(arr2[i]) - 1);
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
        System.out.println("enter the size of second array : ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        boolean ans = isIdentical(arr, arr2, n, n2);
        System.out.println("both array is identical or not = " + ans);

    }
    
}
