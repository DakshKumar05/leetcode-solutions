class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        int index= ch- 'a';
            freq[index]++;
        }
        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            int index= ch-'a';
            freq[index]--;
        }
        for(int k=0;k<freq.length;k++){
        if(freq[k]!=0){
            return false;
        }
        
            
        
    } return true;
}
}
