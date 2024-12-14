import java.util.Scanner;

public class _25ReplaceAllZero_with5 {
        // we use reverse a number code 
        // agar mera reminder 0 aata hai to mai uski jgh 5 put kar duga 
        // fir again mai number ko reverse kar duga : 
    public static int convetfive(int num){
        int n = num;

        int reverse1 = 0;

        while(n != 0){
            int rem = n % 10;

            if(rem == 0){
                rem = 5;
            }
            reverse1 = reverse1 * 10 + rem;
            n = n/10;
        }

        int m = reverse1;
        int reverse2 = 0;

        while(m != 0){
            int rem = m % 10;
            reverse2 = reverse2 * 10 + rem;
            m = m/10;
        }

        return reverse2;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int ans = convetfive(n);
        System.out.println(ans);
        
    }
}
