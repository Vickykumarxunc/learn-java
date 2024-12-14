import java.util.ArrayList;
import java.util.Scanner;

public class _10Value_equal_to_index_value {

    public static ArrayList<Integer> valueEqualToIndexValue(int arr[]){
       
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){

            if(arr[i] == i + 1){
                list.add(arr[i]);
            }
        }
        return list;
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

        ArrayList<Integer> ans = valueEqualToIndexValue(arr);
        System.out.println(ans);


      
    }
    
}
