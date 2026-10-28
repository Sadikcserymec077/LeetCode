class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int freq[] = new int[1_00_001];
        for(int i : arr) {
            freq[i]++;
        } 
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > n / 4) return i;
        }
        return -1;
    }
}