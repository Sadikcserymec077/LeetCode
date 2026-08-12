class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
        int n = nums.length;
        int i = 0,j = 0,res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j < n)
        {
            int num = nums[j];
            map.put(num, map.getOrDefault(num, 0) + 1);
            while(map.get(num) > k)
            {
                int d = nums[i];
                map.put(d, map.get(d) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }    
        return res;
    }
}