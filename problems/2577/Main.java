import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int abc = a*b*c;

        int div = 1;
        int[] arr = new int[10];

        while(div <= abc) {
            int tmp = (abc % (div*10));
            arr[tmp/div]++;
            abc -= tmp;
            div *= 10;
        }

        for(int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }
    }
}
