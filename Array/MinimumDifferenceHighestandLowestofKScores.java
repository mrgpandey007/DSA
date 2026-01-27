import java.util.Arrays;

public class MinimumDifferenceHighestandLowestofKScores {
    static class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        if(k==n) return nums[n-1]-nums[0];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-k; i++) {
            min=Math.min(min,nums[i+k-1]-nums[i]);
        }
        return min;
    }
}
}