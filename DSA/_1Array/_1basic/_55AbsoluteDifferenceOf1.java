import java.util.ArrayList;
import java.util.Scanner;

public class _55AbsoluteDifferenceOf1 {
    public static int[] getDigitDiff1AndLessk(int arr[] , int k , int n){

        //* array list ans ko store karegi  */
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(arr[i] < k){
                if(isDiffOne(arr[i])){
                    list.add(arr[i]);
                }
            }
        }

        //* create a ans array : of size of array list  */
        int ans[]  = new int[list.size()];
        int j = 0;
        for(int i = 0; i<ans.length; i++){
            ans[j]  = list.get(i);
            j++;
        }

        //* return the ans :  */
        return ans;
    }

    //* function which check the digit have 1 difference or not   */
    public static boolean isDiffOne(int num){

        //* base case :  */
        if(num >= 0 && num <= 9){
            return false;
        }

        //* this array list store the digit one by one of a particular element :  */
        ArrayList<Integer> list = new ArrayList<>();
        
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            list.add(rem);
            temp = temp/10;
        }

        //* check if the diffrence is not one return false : else return true :  */
        for(int i = 0; i<list.size() - 1; i++){
            if(Math.abs(list.get(i) - list.get(i + 1)) != 1){
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
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        int ans[] = getDigitDiff1AndLessk(arr, k, n);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
