import java.util.Scanner;

public class ClothStitchingPathOptimization {
    public static long calculateMinThread(int M, int N, int T) {
        int turn = 0 ;
        if(M>1 && N>1) turn = 2* (Math.min(M,N)-1);
        return M*N+turn*T;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int M = scanner.nextInt(), N = scanner.nextInt(), T = scanner.nextInt();
            System.out.println(calculateMinThread(M, N, T));
        } finally {
            scanner.close();
        }
    }
}