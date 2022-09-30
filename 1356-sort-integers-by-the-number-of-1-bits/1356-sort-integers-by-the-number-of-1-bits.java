class Solution {
    public int[] sortByBits(int[] arr) {
        insertionSort(arr);
        return arr;
    }
    
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                int firstBit = ones(arr[j]);
                int secondBit = ones(arr[j - 1]);
                if (firstBit < secondBit) swap(arr, j, j - 1);
                else if (firstBit == secondBit) {
                    if (arr[j] < arr[j - 1]) swap(arr, j, j - 1);
                }
                else break;
            }
        }
    }
    
    static int ones(int n){
        int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
    
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}