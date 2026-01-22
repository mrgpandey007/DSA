class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean temp[] = new boolean[nums.length+1];
        for(int num:nums) {
            temp[num]=true;
        }
        List<Integer> ans= new ArrayList<>();
        for(int i=1;i<nums.length+1;i++) {
            if(!temp[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}