import java.util.HashMap;
import java.util.Scanner;

public class _2TwoArray_equal_orNot {

    public static boolean is_equal(int a[] , int b[]){
        int n = a.length;
        int m = b.length;

        HashMap<Integer , Integer> map = new HashMap<>();

        // ek array ko hash me store kar luga : 
        for(int i = 0; i<n; i++){
            
            if(map.containsKey(a[i])){
                map.put(a[i] , map.get(a[i]) + 1);
            }
            else{
                map.put(a[i] , 1);
            }

        }
        // check the second array element is present in the map or not : 
        for(int i = 0; i<m; i++){

            if(!map.containsKey(b[i]) || map.get(b[i]) == 0){
                return false;
            }
            else{
                map.put(b[i] , map.get(b[i]) - 1);
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n1 = sc1.nextInt();
        System.out.println("enter the array element : ");
        int arr1[] = new int[n];
        for (int i = 0; i<n1; i++)
        {
            arr1[i] = sc1.nextInt();
        }
        
        boolean ans = is_equal(arr ,arr1);
        System.out.println(ans);
    }
}