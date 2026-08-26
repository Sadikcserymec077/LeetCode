class Solution {
    public String shortestBeautifulSubstring(String s, int k) 
    {
        int n = s.length();
        String res = "";   
        int i=0,j=0;
        int ones = 0;
        while(j < n) {
            if(s.charAt(j) == '1') {
                ones++;
            }
            while(ones > k || (i <= j && s.charAt(i) == '0')) {
                if(s.charAt(i) == '1') {
                    ones--;
                }
                i++;
            }
            if(ones == k) {
                String temp = s.substring(i,j+1);
                if(res.length() == 0 || res.length() > j-i+1 || 
                    (temp.length() == res.length() && temp.compareTo(res) < 0)) {
                    res = temp;
                }
            }
            j++;
        }
        return res;
    }
}