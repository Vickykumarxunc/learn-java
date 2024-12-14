import java.util.Scanner;

public class _23last_index_of1 {

    public static int lastIndex(String s){
        int n = s.length();

        for(int i = n - 1; i>= 0; i--){
            if(s.charAt(i) == '1'){

                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any string : ");
        String s = sc.nextLine();

        int ans = lastIndex(s);
        System.out.println(ans);

    }
    
}