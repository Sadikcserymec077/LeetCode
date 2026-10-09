class Solution {
    public int absDifference(int[] nums, int k) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int maxsum = 0;
        int minsum = 0;
        for(int i=n-k;i<n;i++)
        {
            maxsum += nums[i];
        }
        for(int i=0;i<k;i++)
        {
            minsum += nums[i];
        }  
        return Math.abs(maxsum-minsum);  
    }
}