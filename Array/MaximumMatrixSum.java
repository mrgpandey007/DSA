class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int neg = 0, min = 100001;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0) {
                    neg++;
                    num = -num;
                }
                sum += num;
                if (num < min) {
                    min = num;
                }
            }
        }
        return (neg % 2 == 0) ? sum : (sum - 2 * min);
    }
}