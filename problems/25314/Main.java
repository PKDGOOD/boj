import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for(int i=0; i<n/4; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
