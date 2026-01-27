import java.util.Scanner;

public class WaterSlideCongestionManagement {
    public static int maxTotalPopularity(int[] P, int N) {
        if (N == 0) return 0;
        int prev2 = 0;                  
        int prev1 = 0;  
        for (int i = 0; i < N; i++) {
            int temp = Math.max(prev1, prev2 + P[i]);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println(maxTotalPopularity(P, N));
        sc.close();
    }
}