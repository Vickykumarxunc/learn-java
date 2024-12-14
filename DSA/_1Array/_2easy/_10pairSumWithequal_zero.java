import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _10pairSumWithequal_zero {
    public static ArrayList<ArrayList<Integer>> getPair(int arr[] , int n)
    {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // first sort the array : 
        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;

        while(start < end){
            int sum = arr[start] + arr[end];

            if(sum == 0){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[start]);
                list.add(arr[end]);
                ans.add(list);

                start++;
                end--;

                while(start < end && arr[start] == arr[start - 1]){
                    start++;
                }
                while(start < end && arr[end] == arr[end + 1]){
                    end--;
                }

            }
            else if(sum > 0){
                end--;
            }
            else if(sum < 0){
                start++;
            }
        }

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

        ArrayList<ArrayList<Integer>> ans = getPair(arr, n);
        System.out.println(ans);
    }
}
