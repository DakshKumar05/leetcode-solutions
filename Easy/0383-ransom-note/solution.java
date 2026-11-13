class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
       
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            int index = ch-'a';
            freq[index]--;
        }
        for(int j=0;j<magazine.length();j++){
            char ch=magazine.charAt(j);
            int index= ch-'a';
            freq[index]++;
        }
        for(int k=0;k<freq.length;k++){
            if(freq[k]<0){
                return false;
            }
        }  return true;
    } 
}
