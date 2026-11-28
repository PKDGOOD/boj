import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int x=-1, y=-1;

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                int tmp = sc.nextInt();
                if(tmp > max) {
                    max = tmp;
                    x = i+1;
                    y = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
