class Solution {
    public String findValidPair(String s) {
        String str = "";
        int n = s.length();
        for(int i=0;i<n-1;i++)
            {
                char ch = s.charAt(i);
                char ch2 = s.charAt(i+1);
                if(ch == ch2)continue;
                int count1=0,count2=0;
                for(char c : s.toCharArray())
                    {
                        if(c == ch)count1++;
                        if(c == ch2)count2++;
                    }
                int num1 =ch-48;
                int num2 =ch2-48;
                if(count1 == num1 && count2 == num2)
                {
                    str += ch;
                    str += ch2;
                    break;
                }
            }
        return str;
    }
}