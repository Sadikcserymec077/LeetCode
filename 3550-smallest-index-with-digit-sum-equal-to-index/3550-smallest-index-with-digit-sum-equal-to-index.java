class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int res = digitsum(nums[i]);
            if(i == res)
            {
                return i;
            }
        }
        return -1;
    }
    public int digitsum(int n)
    {
        int sum = 0;
        while(n !=0)
        {
            int ld = n % 10;
            sum += ld;
            n = n/10;
        }
        return sum;
    }
}