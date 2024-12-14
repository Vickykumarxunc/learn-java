// integer of each row is sorted in ascending order from left to right : 
// integer of each column is sorted in ascending order from top to bottom : 

import java.util.Scanner;

public class _10SearchElement_matrix2 {
    public static boolean search2(int matrix[][] , int target){

        int n = matrix.length;
        int m = matrix[0].length;

        // take two pointer : 
       int start = 0;
       int end = m - 1;

       while(start < n && end >  0){
        
        // if found my target return true : 
        if(matrix[start][end] == target){
            return true;
        }

        // agar mera target chota hai to column ko kam kar do : move left side : 
        if(target < matrix[start][end]){
            end--;
        }
        // agar mera target bada hai to row ko increase kar do : go down ward : 
        if(target > matrix[start][end]){
            start++;
        }

       }
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

         boolean ans = search2(matrix, target);
         System.out.println(ans);

        
    }
}
