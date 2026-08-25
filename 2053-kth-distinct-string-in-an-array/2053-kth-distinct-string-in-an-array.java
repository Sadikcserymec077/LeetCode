class Solution {
    public String kthDistinct(String[] arr, int k) 
    {
        int n = arr.length;
        String str[] = new String[n];
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr)
        {
            map.put(s,map.getOrDefault(s,0) + 1);
        }  
        for(String key : arr)
        {
            if(map.get(key) == 1)
            {
                k--;
                if(k == 0)
                    return key;
            }
        }
        return "";
    }
}