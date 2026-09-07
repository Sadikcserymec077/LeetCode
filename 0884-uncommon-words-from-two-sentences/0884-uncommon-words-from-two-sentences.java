class Solution {
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        String str1[] = s1.split(" ");
        String str2[] = s2.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            map1.put(str1[i],map1.getOrDefault(str1[i],0) + 1);
        }    
        for(int i=0;i<str2.length;i++)
        {
            map2.put(str2[i],map2.getOrDefault(str2[i],0) + 1);
        }    
        ArrayList<String> uncommon = new ArrayList<>();
        for(var entry : map1.entrySet())
        {
            String word = entry.getKey();
            int freq = entry.getValue();
            if(freq == 1 && !map2.containsKey(word))
            {
                uncommon.add(word);
            }
        }
        for(var entry : map2.entrySet())
        {
            String word = entry.getKey();
            int freq = entry.getValue();
            if(freq == 1 && !map1.containsKey(word))
            {
                uncommon.add(word);
            }
        }
        return uncommon.stream().toArray(String[]::new);
    }
}