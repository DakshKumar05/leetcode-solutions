class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int currwater;
        int maxwater=0;
        while(left<right){
            currwater=Math.min(height[left],height[right])*(right-left);
            maxwater=Math.max(maxwater,currwater);

        
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }

         
    }
    return maxwater;
}
}
