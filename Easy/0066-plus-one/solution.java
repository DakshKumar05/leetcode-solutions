class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int last=digits.length-1;
        
        while(last>=0){
            if(digits[last]<9){
                digits[last]++;
                return digits;
            }
            else{
                digits[last]=0;
                last--;
            }
        }
                 
                 
                 int[] result = new int[digits.length + 1];
                result[0]=1;
            
        
                return result;
            
        }
        }
