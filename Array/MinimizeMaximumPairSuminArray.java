class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2,max=0;
        int right = 2*n-1;
        for(int i=0;i<n;i++) {
            nums[i]+=nums[right--];
            max=Math.max(nums[i],max);
        }
        return max;
    }
}