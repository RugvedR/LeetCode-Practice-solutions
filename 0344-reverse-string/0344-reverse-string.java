class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        for(int i=0; i<s.length/2; i++){
            swap(s, i, j--);
        }
    }
    static void swap(char[] a, int i, int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}