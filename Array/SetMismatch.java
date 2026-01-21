class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length, sum = n*(n+1)/2;
        long sq_sum = (long) n*(n+1)*(2*n+1)/6;
        for(int num:nums) {
            sum-=num;
            sq_sum-= num*num;
        }
        sq_sum = sq_sum / sum ;// (x^2-y^2)/(x-y);
        
        int[] ans = new int[2];
        ans[0] = (int) (sq_sum-sum)/2;
        ans[1] = (int) sum+ans[0];
        return ans;
    }
}