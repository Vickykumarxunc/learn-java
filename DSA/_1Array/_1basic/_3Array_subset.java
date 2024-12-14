import java.util.HashMap;
import java.util.Scanner;

public class _3Array_subset {
    public static boolean issubset(int arr1[] , int arr2[] , int n , int m){

        if(n < m){
            return false;
        }

        // create a hashmap which contain the value of array 1 : 
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0; i<n; i++){

            if(!map.containsKey(arr1[i])){
                map.put(arr1[i] , 1);
            }
            else{
                map.put(arr1[i] , map.get(arr1[i]) + 1);
            }
        }

        // traverse on the array 2 and check the value of array2 is present inside the hashmap or not : 
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

        System.out.println("enter the size of array 2 : ");
        int m = sc.nextInt();

        int arr2[] = new int[m];
        System.out.println("enter the array element : ");
        for(int i = 0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        boolean ans = issubset(arr1, arr2, n, m);
        System.out.println(ans);
    }
    
}
