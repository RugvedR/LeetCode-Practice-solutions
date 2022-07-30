class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2){
        int[] lettersFreqInSubsetString = new int[26];
        int[] tmp = new int[26];
        int i;
        for(String s: words2){
            tmp = getFrequencies(s);
            for(i=0; i< 26;i++){
                lettersFreqInSubsetString[i] = Math.max(lettersFreqInSubsetString[i], tmp[i]);
            }
        }

        List<String> ansList = new ArrayList<>();
        for(String s: words1){
            tmp = getFrequencies(s);
            for(i=0; i<26; i++){
                if(tmp[i] < lettersFreqInSubsetString[i]){
                    break;
                }
            }

            if(i==26){
                ansList.add(s);
            }
        }
        return ansList;
    }

    static int[] getFrequencies(String s){
        int[] frequencies = new int[26];
        for(char ch: s.toCharArray()){
            frequencies[ch - 'a']++;
        }
        return frequencies;
    }
}