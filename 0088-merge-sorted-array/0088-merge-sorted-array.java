class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        int newarr[] = new int[m+n];
        for(int i=0;i<m;i++)
        {
           newarr[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            newarr[m+i]=nums2[i];
        }
        Arrays.sort(newarr);
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=newarr[i];
        }
    }
}