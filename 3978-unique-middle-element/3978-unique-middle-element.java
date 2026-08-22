class Solution {
    public boolean isMiddleElementUnique(int[] nums) 
    {
        int n = nums.length;
        int index = nums.length/2;
        int num = nums[index];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(num == nums[i])
            {
                count++;
            }
        }
        return count == 1;
    }
}