class Solution {
    public String digitSum(String s, int k) 
    {
        int n = s.length();
        while(n > k)
        {
            StringBuilder next = new StringBuilder();
            for(int i=0;i<n;i=i+k)
            {
                int sum = 0;
                for(int j = i;j < n && j < i+k; j++)
                {
                    sum += s.charAt(j) - '0';
                }
                next.append(sum);
            }
            s = next.toString();
            n = s.length();
        }
        return s;
    }
}