class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int mindiff=Integer.MAX_VALUE;
        for(int right=k-1;right<nums.length;right++){
            int diff=nums[right]-nums[right-k+1];
           mindiff=Math.min(diff, mindiff);
        }
        return mindiff;
    }
}
