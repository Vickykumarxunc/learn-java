import java.util.Scanner;

public class _29findElementAtGivenIndex {
    public static int findElementAtIndex(int arr[] , int index){
        int ans = arr[index];
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
        System.out.println("enter the index no : ");
        int index = sc.nextInt();
        int ans = findElementAtIndex(arr, index);
        System.out.println(ans);
    }
}
