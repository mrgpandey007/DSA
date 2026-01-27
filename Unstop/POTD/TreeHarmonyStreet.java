import java.util.*;

public class TreeHarmonyStreet {
    static int maxAdditionalTrees(int[] P, int N) {
        int additionalTrees = 0;
        for (int i = 0; i < N; i++) {
            if (P[i] == 0) {
                boolean leftClear = (i == 0) || (P[i - 1] == 0);
                boolean rightClear = (i == N - 1) || (P[i + 1] == 0);

                if (leftClear && rightClear) {
                    P[i] = 1; // Plant the tree
                    additionalTrees++;
                }
            }
        }
        return additionalTrees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int N = scanner.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = scanner.nextInt();
            }
            int result = maxAdditionalTrees(P, N);
            System.out.println(result);
        } finally {
            scanner.close();
        }
    }
}