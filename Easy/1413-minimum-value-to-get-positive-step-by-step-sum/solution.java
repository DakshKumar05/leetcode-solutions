class Solution {
    public int minStartValue(int[] nums) {
        int prefixsum=0;
        int minval=0;
        for(int i=0;i<nums.length;i++){
            prefixsum += nums[i];
            minval=Math.min(minval,prefixsum);
        }
        return 1-minval;
    }
}
