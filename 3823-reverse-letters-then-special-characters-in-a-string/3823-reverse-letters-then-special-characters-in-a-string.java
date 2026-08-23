class Solution 
{
    public String reverseByType(String s) 
    {
        char arr[] = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while(i < j)
        {
            while(i<j && !Character.isLetter(arr[i]))
            {
                i++;
            }
            while(i<j && !Character.isLetter(arr[j]))
            {
                j--;
            }
            if(i < j)
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        i = 0;
        j = n - 1;

        while(i < j)
        {
            while(i<j && Character.isLetter(arr[i]))
            {
                i++;
            }
            while(i<j && Character.isLetter(arr[j]))
            {
                j--;
            }
            if(i < j)
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);   
    }
}