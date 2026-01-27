import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static int minfuel(int n,int[] w,int k) {
         if (k > n) {
            return -1;
        }

        int[][] dp = new int[k + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, 1000000000);
        }

       
        dp[0][0] = 0;

  
        for (int s = 1; s <= k; s++) {
            for (int i = 1; i <= n; i++) {
                int cur = 0;

                for (int p = i - 1; p >= s - 1; p--) {
                    cur = Math.max(cur, w[p]);
                    
                    if (dp[s - 1][p] != 1000000000) {
                        dp[s][i] = Math.min(dp[s][i], dp[s - 1][p] + cur);
                    }
                }
            }
        }
        return dp[k][n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = input.nextInt();
            int[] weight = new int[n];
            for(int i=0; i < n ; i++) {
                weight[i]=input.nextInt();
            }
            int slip = input.nextInt();
            System.out.println(minfuel(n,weight,slip));
        } finally {
            input.close();
        }
    }
}