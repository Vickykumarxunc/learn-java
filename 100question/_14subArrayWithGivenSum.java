import java.util.ArrayList;
import java.util.Scanner;

public class _14subArrayWithGivenSum {
    public static ArrayList<Integer> subarray(int arr[] , int target){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        int j = 0; // j tab mai use karuga jab mera sum target sum se bada ho ; 
        for(int i = 0; i<n; i++){
            sum += arr[i];

            // agar mera sum target sum se bada ho to sum me se choti value ko decrease karo : 
            while (sum > target && j < i) {
                sum -= arr[j];
                j++;
            }
            // agar sum target sum ke barabr ho to list me index add kar ke return ho jao;
            if (sum == target) {
                list.add(j + 1);
                list.add(i + 1);
                break;   
            }
        }
        // agar meri list empty hai : to list me add kar do -1;
        if(list.isEmpty()){
            list.add(-1);
        }

    // return the ans ; 
    return list;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array : ");
       int n  = sc.nextInt();

       int arr[] = new int[n];
       System.out.println("enter the array element : ");
       for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
       }

       System.out.println("enter the target sum : ");
       int target = sc.nextInt();
       ArrayList<Integer> ans = subarray(arr, target);
       System.out.println(ans);
        
    }
    
}
