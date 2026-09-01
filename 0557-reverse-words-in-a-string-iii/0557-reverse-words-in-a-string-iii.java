class Solution {
    public String reverseWords(String s) 
    {
        String str[] = s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            str[i] = rev(str[i]);
        }
        return String.join(" ",str);
    }
    public String rev(String s)
    {
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        return rev;
    }
}