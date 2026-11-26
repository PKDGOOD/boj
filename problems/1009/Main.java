import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tmp = 1;
            for(int x=0; x<b; x++) {
                tmp *= a; // 큰수나 제곱이 많이 나오면 오버플로우 나서 쓰레기값이 됨
                tmp = tmp % 10; // 10대 컴퓨터 순환하는 순서만 알면 되기 때문에 나머지만 남긴다
            }
            if(tmp == 0) tmp = 10; // 10번째 컴퓨터가 마지막으로 처리하는경우 10으로 딱 떨어져서 나머지가 0

            System.out.println(tmp);
        }
    }
}
