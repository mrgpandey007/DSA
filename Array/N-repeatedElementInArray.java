class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        for(int i:nums) {
            if(ans.contains(i)) {
                return i;
            } else {
                ans.add(i);
            }
        }
        return 0;
    }
}