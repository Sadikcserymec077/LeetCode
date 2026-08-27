class Solution {
    public List<Integer> findPeaks(int[] nums) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
            {
                arr.add(i);
            }
        }    
        return arr;
    }
}