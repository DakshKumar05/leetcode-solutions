class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int total=0;
            for(int j=i;j<arr.length;j++){
                total+=arr[j];
                if((j-i+1)%2==1){
                    sum+=total;
                }
            } 
        }
        return sum;
    }
}
