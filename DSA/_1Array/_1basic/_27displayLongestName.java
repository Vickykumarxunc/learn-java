import java.util.ArrayList;
import java.util.Scanner;

public class _27displayLongestName {
    public static String longest(ArrayList<String> names){
        String max_string = names.get(0);

        for(int i = 1; i<names.size(); i++){
            
            String current_string = names.get(i);

            if(current_string.length() > max_string.length()){
                max_string = current_string;
            }

        }
        return max_string;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("vicky");
        list.add("ronak");
        list.add("devendra");


        String ans = longest(list);
        System.out.println("longest name = " + ans);
    }
}
