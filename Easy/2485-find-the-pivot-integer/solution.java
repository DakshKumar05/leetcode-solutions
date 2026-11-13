class Solution {
    public int pivotInteger(int n) {
        int total=0;
        int leftsum=0;
        for(int i=0;i<=n;i++){
            total+=i;
        }
        for(int i=0;i<=n;i++){
        int rightsum=total-leftsum-i;
            if (rightsum==leftsum){
                return i;
            }
            leftsum+=i;
        } return -1;
    }
        
    }
