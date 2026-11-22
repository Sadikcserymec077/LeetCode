class Solution {
    public boolean checkString(String s) {
        boolean seenb=false;
        for(char c:s.toCharArray())
        {
            if(c=='b')
            {
                seenb=true;
            }
            else if(c=='a' && seenb)
            {
                return false;
            }
        }
        return true;
    }
}