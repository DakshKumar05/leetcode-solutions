class Solution {
    public boolean isPalindrome(int x) {
        int orignal =x;
        int rev=0;
        int digit;
        while(x>0){
        if(x<0){
            return false;
        }
            digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
            
            if(rev==orignal){
                return true;
            }
            else 
            {
                return false;
            }
        
        
    }
}
