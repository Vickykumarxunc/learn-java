import java.util.HashMap;
import java.util.Scanner;
// har element k time prsent hai array me except one find that except elemtn : 
public class _46find_unique_element {
    public static int find_unique(int arr[] , int k ){

        // create a HashMap
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){

            if(!map.containsKey(arr[i])){

                map.put(arr[i] , 1);
            }
            else{
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
        }

        // traverse the hashMap : 
        for(int i = 0; i<arr.length; i++){

            if(map.get(arr[i]) != k){
                return arr[i];
            }
        }
        return -1;
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

        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        int unique_element = find_unique(arr, k);
        System.out.println(unique_element);
    }
}
