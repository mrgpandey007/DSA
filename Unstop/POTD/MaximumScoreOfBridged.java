import java.io.*;
import java.util.*;
public class Main {
    static class Pair {
        long dp0, dp1;
        Pair(long a, long b) {
            dp0 = a;
            dp1 = b;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        long[] nums = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }
        long diff = Long.parseLong(br.readLine().trim());
        TreeMap<Long, Pair> map = new TreeMap<>();
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            long x = nums[i];
            long best0 = x; 
            long best1 = x;
            long low = x - diff;
            long high = x + diff;
            for (Pair p : map.subMap(low, true, high, true).values()) {
                best0 = Math.max(best0, p.dp0 + x);
                best1 = Math.max(best1, p.dp1 + x);
            }
            for (Pair p : map.values()) {
                best1 = Math.max(best1, p.dp0 + x);
            }
            Pair curr = map.getOrDefault(x, new Pair(Long.MIN_VALUE, Long.MIN_VALUE));
            curr.dp0 = Math.max(curr.dp0, best0);
            curr.dp1 = Math.max(curr.dp1, best1);
            map.put(x, curr);
            ans = Math.max(ans, Math.max(best0, best1));
        }
        System.out.println(ans);
    }
}