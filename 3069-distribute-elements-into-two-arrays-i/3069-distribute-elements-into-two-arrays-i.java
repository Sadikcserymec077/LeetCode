class Solution {
    public int[] resultArray(int[] nums) 
    {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];

         arr1[0] = nums[0];
         arr2[0] = nums[1];
        int j = 0;
        int k = 0;
        for(int i=2;i<n;i++)
        {
            if(arr1[j] > arr2[k])
            {
                arr1[++j] = nums[i];
            }
            else
            {
                arr2[++k] = nums[i];
            }
        }   
        int p = 0;
        for(int i=0;i<=j;i++)
        {
            nums[p++] = arr1[i];
        } 
        for(int i=0;i<=k;i++)
        {
            nums[p++] = arr2[i];
        }
        return nums;
    }
}