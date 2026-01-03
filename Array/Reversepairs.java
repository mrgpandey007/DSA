class Solution {
    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int k = 0, i = start, j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= end) temp[k++] = arr[j++];
        
        for (i = 0; i < temp.length; i++) arr[i+start] = temp[i];
    }

    public static int mergesort(int arr[], int start, int end) {
        if (start >= end) return 0;
        int count=0,mid = (start + end) / 2;
        count+=mergesort(arr, start, mid);
        count+=mergesort(arr, mid + 1, end);
        count+= countpair(arr,start,mid,end);
        merge(arr, start,mid, end);
        return count;
    }
    public static int countpair(int[] arr,int start,int mid,int end) {
        int count=0,right=mid+1;
        for(int i=start;i<=mid;i++) {
            while(right<=end && (long)arr[i]> 2L*arr[right]) {
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }

    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }
}