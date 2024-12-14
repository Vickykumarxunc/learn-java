import java.util.Scanner;

public class _38find_the_fine {

    public static int totalFine(int date , int car[] , int fine[]){
        int n = car.length;
        int total_fine = 0;

        for(int i = 0; i<n; i++){
            if((car[i] % 2 == 0 && date % 2 != 0) || (car[i] % 2 != 0 && date % 2 == 0 )){
                total_fine += fine[i];
            }
        }
        return total_fine;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the date : ");
        int date = sc.nextInt();

        System.out.println("enter the size of car array : ");
        int n1 = sc.nextInt();
        System.out.println("enter the car array element : ");
        int car[] = new int[n1];
        for(int i = 0; i<n1; i++){
            car[i] = sc.nextInt();
        }

        System.out.println("enter the size of fine array : ");
        int n2 = sc.nextInt();
        System.out.println("enter the element of fine array : ");
        int fine[] = new int[n2];
        for(int i = 0; i<n2; i++){
            fine[i] = sc.nextInt();
        }

        int ans = totalFine(date, car, fine);
        System.out.println("total fine = " + ans);


    }
}
