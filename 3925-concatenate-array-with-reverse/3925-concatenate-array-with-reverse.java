class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            ans[i]=nums[2*n-i-1];
        }
        return ans;
        
    }
}