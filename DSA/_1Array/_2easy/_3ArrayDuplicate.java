import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class _3ArrayDuplicate {
    public static ArrayList<Integer> duplicate(int arr[] , int n){

        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
            
        }
       // ab mai har ek key set par travel karuga : 
       for(int key : map.keySet()){
        if(map.get(key) > 1){
            ans.add(key);
        }
       }

        if(ans.isEmpty()){
            ans.add(-1);
        }

        Collections.sort(ans);
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

        ArrayList<Integer> ans = duplicate(arr, n);
        System.out.println(ans);
    }
}
