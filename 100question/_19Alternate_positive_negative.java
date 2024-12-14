import java.util.ArrayList;
import java.util.Scanner;

public class _19Alternate_positive_negative {
    public static void rearrange(int arr[]){
        int size = arr.length;

        // make a two array list which store the positive and negative value : 
        ArrayList<Integer> positve = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // fill the array list : 
        for(int i = 0; i<size; i++){
            if(arr[i] < 0){
                negative.add(arr[i]);
            }
            else{
                positve.add(arr[i]);
            }
        }

        // create a answer : 
        int i = 0; // traverse on array : help for fill the element : 
        int p = 0; // traverse on positive arraylist : 
        int n = 0; // traverse on negative arraylist : 

        while (p < positve.size() && n < negative.size()) {
            if(i % 2 == 0){
                arr[i] = positve.get(p);
                p++;
            }
            else{
                arr[i] = negative.get(n);
                n++;
            }
            i++;
            
        }

        // remaining element : 
        while (p < positve.size()) {
            arr[i] = positve.get(p);
            i++;
            p++;
            
        }
        while (n < negative.size()) {
            arr[i] = negative.get(n);
            i++;
            n++;
            
        }

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

       rearrange(arr);
       for(int i = 0; i<n; i++){
        System.out.print(arr[i] + " ");
       }
    }
    
}
