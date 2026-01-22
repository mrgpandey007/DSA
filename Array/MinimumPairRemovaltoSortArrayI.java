class Solution {
    public boolean issorted(int[] nums , int n) {
        for(int i=0;i<n-1;i++) {
            if(nums[i]>nums[i+1]) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int n=nums.length,ans=0;
        while(!issorted(nums,n)) {
            ans+=1;
            int min = Integer.MAX_VALUE, pos = -1;
            for(int i=1;i<n;i++) {
                if((nums[i-1]+nums[i])<min) {
                    min=nums[i-1]+nums[i];
                    pos=i;
                }
            }
            nums[pos-1]=min;
            for(int i=pos;i<n-1;i++) {
                nums[i] = nums[i+1];
            }
            n--;
        }
        return ans;
    }
}