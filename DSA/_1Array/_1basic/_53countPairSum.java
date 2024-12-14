import java.util.Scanner;

public class _53countPairSum {

    public static int countPair(int arr1[] , int arr2[] , int n , int m , int target){
        int i = 0;
        int j = n - 1;
        int count = 0;

        while(i < m && j >= 0){
            
            if(arr1[i] + arr2[j] == target){
                i++;
                j--;
                count++;
            }
            else if(arr1[i] + arr2[j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
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
        System.out.println("enter the array element : ");
        int arr2[] = new int[n2];
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("enter the target element : ");
        int target = sc.nextInt();

        int ans = countPair(arr1, arr2, n2, n1, target);
        System.out.println("total no of pair exist = " + ans);


    }
    
}
