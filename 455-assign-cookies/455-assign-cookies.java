class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int g_index=0;
        
        for(int i=0; i<s.length; i++){
            if(s[i]>=g[g_index]){
                count++;
                g_index++;
            }
            if(g_index>=g.length) break;
        }
        
        return count;
    }
}