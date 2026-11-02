class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int requirednum=target-nums[i];
            if(mpp.containsKey(requirednum))
            {
                return new int []{mpp.get(requirednum),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{};
    }
}