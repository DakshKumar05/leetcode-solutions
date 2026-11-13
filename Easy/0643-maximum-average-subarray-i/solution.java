class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];

        }
        long maxsum=windowSum;
        for(int right=k;right<nums.length;right++){
            windowSum+=nums[right];
            windowSum-=nums[right-k];
            maxsum=Math.max(windowSum,maxsum);
        }
        return (double)maxsum/k;
    }
}
