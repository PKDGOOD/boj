import java.util.*;

public class Main {
    public static void main(String[] args) {
        String txt = new Scanner(System.in).nextLine();
        String[] arr = txt.split(" ");
        int i = 0;
        for(String str : arr) {
            if(str.length() > 0) i++;
        }
        System.out.print(i);
    }
}
