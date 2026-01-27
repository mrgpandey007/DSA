import java.util.Scanner;

public class SmartIronStationOptimization {
    public static int computeTotalTime(int N, int[] fabric, int[] temp) {
        if (N == 0) {
            return 0;
        }
        int total = 1; 
        for (int i = 1; i < N; i++) {
            total += 1;
            if (fabric[i] != fabric[i - 1]) {
                total += Math.abs(temp[i] - temp[i - 1]);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int N = sc.nextInt();
            
            int[] fabric = new int[N];
            int[] temp = new int[N];
            
            for (int i = 0; i < N; ++i) {
                fabric[i] = sc.nextInt();
            }
            
            for (int i = 0; i < N; ++i) {
                temp[i] = sc.nextInt();
            }
            
            // Call user logic function and print the output
            int totalTime = computeTotalTime(N, fabric, temp);
            System.out.println(totalTime);
        } finally {
            sc.close();
        }
    }
}