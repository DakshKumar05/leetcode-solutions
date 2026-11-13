class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int votecount=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
              if (votecount==0){
                candidate=num;
              }
              if(num==candidate){
                votecount++;
              }
              else{
                votecount--;
              }
        }
        
        return candidate;
        
    }
}
