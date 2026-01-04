class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length, sum_org;
        n *= n;
        sum_org = n * (n + 1) / 2;
        long sqrt_org = (long) n * (n + 1) * (2 * n + 1) / 6, sqrt = 0, sum = 0;
        for (int[] nums : grid) {
            for (int num : nums) {
                sum += (long) num;
                sqrt += (long) (num * num);
            }
        }
        long x_y = sum_org - sum;
        long x2_y2 = sqrt_org - sqrt;
        long res = x2_y2 / x_y;
        ans[1] = (int) (x_y + res) / 2;
        ans[0] = (int) (res - ans[1]);
        return ans;
    }
}