class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[101];
        for(int num:nums) temp[num]++;
        for(int i=1;i<101;i++) temp[i]+=temp[i-1];
        for(int i=0;i<nums.length;i++) if(nums[i]>0) nums[i]=temp[nums[i]-1];
        return nums;
        //Approach 1 (Brute force , simple, easy to understand) ~MRG007
        // int n = nums.length;
        // int[] ans = new int[n];
        // for(int i=0;i<n;i++) {
        //     int count=0;
        //     for(int j=0;j<n;j++) {
        //         if(i!=j && nums[i]>nums[j]) {
        //             count++;
        //         }
        //     }
        //     ans[i]=count;
        // }
        // return ans;
    }
}