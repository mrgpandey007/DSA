import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i=0;i<nums.size();i++) {
            int num = nums.get(i);
            if(num % 2 == 0) {
                ans[i]=-1;
            } else {
                ans[i] = num - ((num+1)&(-num-1))/2;
            }
        }
        return ans;
    }
}