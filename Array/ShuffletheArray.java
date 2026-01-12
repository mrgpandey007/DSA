class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp[] = new int[2*n];
        int i=0,j=n;
        for(int k=0;k<2*n;) {
            temp[k++]=nums[i++];
            temp[k++]=nums[j++];
        }
        return temp;
    }
}