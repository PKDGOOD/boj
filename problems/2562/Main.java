import java.util.*;

public class Main {
    public static final int NUM = 9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[NUM];
        for(int i=0; i<NUM; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0; i<NUM; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}
