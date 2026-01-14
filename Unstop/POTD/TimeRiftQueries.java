import java.util.*;
public class Main {
    public static void solveTimeRiftQueries(int N, int M, int[] A, int[][] updates, int Q, int[][] queries) {
    int[][] versions = new int[M + 1][N];
    versions[0] = A.clone();
    for (int i = 1; i <= M; i++) {
        int pos = updates[i - 1][0]-1;        
        int val = updates[i - 1][1];      
        int base = updates[i - 1][2];       
        versions[i] = versions[base].clone();
        versions[i][pos] = val;
    }
    for (int i = 0; i < Q; i++) {
        int V = queries[i][0];  
        int L = queries[i][1]-1;  
        int R = queries[i][2]-1;  
        int K = queries[i][3];  
        List<Integer> list = new ArrayList<>();
        for (int j = L; j <= R; j++) {
            list.add(versions[V][j]);
        }
        Collections.sort(list);
        System.out.println(list.get(K - 1));
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[][] updates = new int[M][3];
        for (int i = 0; i < M; i++) {
            updates[i][0] = scanner.nextInt();
            updates[i][1] = scanner.nextInt();
            updates[i][2] = scanner.nextInt();
        }

        int Q = scanner.nextInt();
        int[][] queries = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
            queries[i][3] = scanner.nextInt();
        }
        solveTimeRiftQueries(N, M, A, updates, Q, queries);
    }
}