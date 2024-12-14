
// each row is sorted in ascending order : 
// first  integer of each row is greater than the last integer of the previous row :  

import java.util.Scanner;

public class _9searchElement_matrix1 {
    public static boolean search1(int matrix[][] , int target){
        
        int n = matrix.length; // no of row : 
        int m = matrix[0].length; // no of column : 

        // take two pointer 
        int start = 0;
        int end = n * m - 1;

        // use binary search : 
        while(start <= end){
            
            // find the mid index : 
            int mid = start + (end - start)/2;

            /// find the mid element : 
            int mid_element = matrix[mid/m][mid % m];

            // mid/m -> tells about the row : 
            // mid % m -> tells about the column : 

            // if get the out target return true : 
            if(mid_element == target){
                return true;
            }
            // agar mera target chota hai mid element se to apane end ko mid - 1 kar do : 
            if(target < mid_element){
                end = mid - 1;
            }
            // agar mera targe bada hai mid element se to apane start index ko mid + 1 kar do : 
            else{
                start = mid + 1;
            }
        }

        // agar target element matrix me exist nahi karta return false : 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix : ");
         int r = sc.nextInt();
         int c = sc.nextInt();

         int matrix[][] = new int[r][c];
         System.out.println("enter the element of the matrix : ");
         
         for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
         }

         System.out.println("enter the target element : ");
         int target = sc.nextInt();

         boolean ans = search1(matrix, target);
         System.out.println(ans);

        
    }
    
}
