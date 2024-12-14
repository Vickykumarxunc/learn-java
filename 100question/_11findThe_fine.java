import java.util.Scanner;

public class _11findThe_fine {

    public static int totalFine(int n , int date , int car[] , int fine[])
    {
        int totalfine = 0;

        for (int i = 0; i<n; i++)
        {
            if (car[i] % 2 == 0 && date % 2 != 0 || car[i] % 2 != 0 && date % 2 == 0 )
            {
                totalfine += fine[i];
            }
        }
        return totalfine;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("enter the element of car array : ");
        int car[] = new int[n];
        for(int i = 0; i<n; i++){
            car[i]  = sc.nextInt();
        }

        System.out.println("enter the fine element : ");
        int fine[] = new int[n];
        for(int i = 0; i<n; i++){
            fine[i] = sc.nextInt();
        }

        System.out.println("enter the date : ");
        int date = sc.nextInt();

        
        
    }
    
}
