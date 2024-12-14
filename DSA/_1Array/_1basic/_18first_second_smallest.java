import java.util.Scanner;

public class _18first_second_smallest {
    public static int[] first_second_min(int arr[]){
        int n = arr.length;
        int ans[] = new int[2];

        int min1 = Integer.MAX_VALUE;
        int min2 = min1;

        for(int i = 0; i<n; i++){

            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i] > min1 && arr[i] < min2){
                min2 = arr[i];
            }

        }
        ans[0] = min1;
        ans[1] = min2;
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

        int ans[] = first_second_min(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
