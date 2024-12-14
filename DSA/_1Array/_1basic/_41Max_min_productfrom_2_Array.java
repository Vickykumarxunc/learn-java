import java.util.Scanner;

public class _41Max_min_productfrom_2_Array {
    public static int find_multiplication(int arr1[] , int arr2[] , int n , int m){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        for(int i = 0; i<m; i++){
            if(arr2[i] < min){
                min = arr2[i];
            }
        }
        int product = max * min;
        return product;
    } 
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter the size of second array : ");
        int n2 = sc.nextInt();

        System.out.println("enter the second array element : ");
        int arr2[] = new int[n2];
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int ans = find_multiplication(arr1, arr2, n1, n2);
        System.out.println(ans);
    }
}
