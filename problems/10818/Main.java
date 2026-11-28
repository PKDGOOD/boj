import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            if(tmp < min) min = tmp;
            if(tmp > max) max = tmp;
        }
        System.out.print(min + " " + max);
    }
}
