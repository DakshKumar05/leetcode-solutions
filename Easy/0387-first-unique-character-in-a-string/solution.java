class Solution {
    public int firstUniqChar(String s) {
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index= ch- 'a';
            freq[index]++;
        }
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            int index= ch- 'a';
            
            if(freq[index]==1){
                return j;
            }
        }
        return -1;
        
            

         
          
          
            
          
    }
        
    }
