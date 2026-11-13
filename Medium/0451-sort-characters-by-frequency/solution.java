class Solution {
    public String frequencySort(String s) {
        int[] freq= new int[128];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index= ch;
            freq[index]++;

        }
        List<Character>[] bucket= new ArrayList[s.length()+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]= new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<128;i++){
            if(freq[i]>0){
                char ch = (char)(i);
                bucket[freq[i]].add(ch);

            }
        }
        for(int i = bucket.length - 1; i >= 1; i--) {
    for(char ch : bucket[i]) {
        for(int j = 0; j < i; j++) {
            sb.append(ch);
        }
    }
}

        return sb.toString();
    }
}
