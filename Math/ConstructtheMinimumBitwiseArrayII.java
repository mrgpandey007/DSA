class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size];
        int i=0;
        for(int num:nums) {
            if(num % 2 ==0 ) {
                ans[i++] = -1;
            } else {
                ans[i++] = num - ((num+1)&(-num-1))/2;
            }
        }
        return ans;
    }
}