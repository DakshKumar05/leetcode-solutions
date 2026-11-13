class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        long windowSum=0;
        for(int i=0;i<k;i++){
             windowSum+=arr[i];
        }
        int count=0;
        if(windowSum/k>=threshold){
                count++;
            }
        for(int right=k;right<arr.length;right++){
            windowSum+=arr[right];
            windowSum-=arr[right-k];
            if(windowSum/k>=threshold){
                count++;
            }
        }
        return count;
    }
}
