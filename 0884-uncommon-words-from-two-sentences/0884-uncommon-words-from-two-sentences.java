class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str=s1.split(" ");
        String[] str1=s2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String> list=new ArrayList<>();
        for(String s:str){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String t:str1) {
              map.put(t,map.getOrDefault(t,0)+1);
        }
        for(String a:map.keySet()){
            if(map.get(a)==1){
                 list.add(a);
            }
        }
        return list.toArray(new String[0]);
    }
}