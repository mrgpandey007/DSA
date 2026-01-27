import java.util.Scanner;

public class MedicineMixing {

    public static long minEnergyCost(int[] T, int K) {
        int N = T.length;
        int[] A = T.clone();
        for (int i = 1; i < N; i++) {
            A[i] = Math.min(A[i], A[i - 1] + K);
        }
        for (int i = N - 2; i >= 0; i--) {
            A[i] = Math.min(A[i], A[i + 1] + K);
        }
        long cost = 0;
        for (int i = 0; i < N; i++) {
            cost += (T[i] - A[i]);
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            int[] T = new int[N];
            for (int i = 0; i < N; i++) {
                T[i] = scanner.nextInt();
            }

            long result = minEnergyCost(T, K);
            System.out.println(result);
        } finally {
            scanner.close();
        }
    }
}