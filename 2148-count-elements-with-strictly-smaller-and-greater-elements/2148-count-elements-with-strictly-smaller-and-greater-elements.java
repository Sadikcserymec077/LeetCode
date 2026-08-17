class Solution {
    public int countElements(int[] nums) 
    {
        int total = 0;
        Arrays.sort(nums);
        int min = nums[0];
        int n = nums.length;
        int max = nums[n-1];
        for(int i=1;i<n-1;i++)
        {
            if(nums[i] > min && nums[i] < max)
            {
                total++;
            }
        }  
        return total;
    }
}