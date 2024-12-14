import java.util.Scanner;

public class _16thirdLargest_element {
    public static int third_largest(int arr[]){
        int n = arr.length;

        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        int max3 = max1;

        for(int i = 0; i<n; i++){

            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] < max1 && arr[i] > max2){
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i] < max1 && arr[i] < max2 && arr[i] > max3){
                max3 = arr[i];
            }
        }
        return max3;
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

        int ans = third_largest(arr);
        System.out.print("third largest element is = " + ans);

    }
    
}
