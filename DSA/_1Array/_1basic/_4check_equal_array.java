import java.util.HashMap;
import java.util.Scanner;

public class _4check_equal_array {
    public static boolean check(int arr1[] , int arr2[] , int n , int m){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i] , 1);
            }
            else{
                map.put(arr1[i] , map.get(arr1[i]) + 1);
            }
        }

        // traverse the array 2 and check the array 2 element present in the map or not : 
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

        int arr1[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[n];
        System.out.println("enter the array element  : ");
        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        boolean ans = check(arr1, arr2, n, n);
        System.out.println(ans);

    }
}
