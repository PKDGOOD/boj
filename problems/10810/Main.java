import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n+1];
        for(int t=0; t<m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int idx=i; idx<=j; idx++) {
                basket[idx] = k;
            }
        }

        for(int i=1; i<=n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
