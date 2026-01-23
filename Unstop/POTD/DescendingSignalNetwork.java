import java.io.*;
import java.util.*;

class Main {
    static class Edge {
        int to;
        long w;
        Edge(int to, long w) {
            this.to = to;
            this.w = w;
        }
    }
    static int N;
    static List<List<Edge>> graph;
    static long[] D;
    static long[][] dp;
    static boolean[][] seen;

    static long dfs(int u, int parent, long lastW) {
        long sum = D[u];
        for (Edge e : graph.get(u)) {
            if (e.to != parent && e.w > lastW) {
                sum += dfs(e.to, u, e.w);
            }
        }
        return sum;
    }
    static long solveEdge(int u, int idx) {
        if (seen[u][idx]) return dp[u][idx];
        seen[u][idx] = true;

        Edge e = graph.get(u).get(idx);
        dp[u][idx] = dfs(e.to, u, e.w);
        return dp[u][idx];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine().trim());
        graph = new ArrayList<>();
        for (int i = 0; i < N; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            long w = Long.parseLong(st.nextToken());
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }
        D = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            D[i] = Long.parseLong(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            graph.get(i).sort(Comparator.comparingLong(e -> e.w));
        }
        dp = new long[N][];
        seen = new boolean[N][];
        for (int i = 0; i < N; i++) {
            int sz = graph.get(i).size();
            dp[i] = new long[sz];
            seen[i] = new boolean[sz];
        }
        long ans = 0;
        for (int u = 0; u < N; u++) {
            long total = D[u];
            for (int i = 0; i < graph.get(u).size(); i++) {
                total += solveEdge(u, i);
            }
            ans = Math.max(ans, total);
        }
        System.out.println(ans);
    }
}