class Solution {
    public int addDigits(int num) {
        int sum =0;
        int n= num;
        if (num == 0) {
                return 0;
        } else {
            sum = (num - 1) % 9+1;
            return sum;
        }       
    }
}