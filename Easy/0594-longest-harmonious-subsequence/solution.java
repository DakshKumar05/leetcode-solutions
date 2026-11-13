class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int windowlength=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
        while(nums[right]-nums[left]>1)
                left++;
                if(nums[right]-nums[left]==1)
                windowlength=Math.max(windowlength,right-left+1);
             


        
        }
        return windowlength;
        
    }
}
