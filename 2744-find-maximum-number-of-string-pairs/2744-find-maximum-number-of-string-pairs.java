class Solution {
    public int maximumNumberOfStringPairs(String[] words) 
    {
        int n = words.length;
        int count = 0;
        for(int i = 0;i < n;i++)
        {
            String s = rev(words[i]);
            for(int j=i+1;j<n;j++)
            {
                if(words[j].equals(s))
                {
                    count++;
                }
            }
        }    
        return count;
    }
    public String rev(String s)
    {
        int n = s.length();
        String rev = "";
        for(int i = n-1;i>=0;i--)
        {
            rev += s.charAt(i);
        }
        return rev;
    }
}