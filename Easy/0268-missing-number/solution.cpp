class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int fakesum=(n*(n+1))/2;
        return fakesum-accumulate(nums.begin(),nums.end(),0);

        
    }
};
