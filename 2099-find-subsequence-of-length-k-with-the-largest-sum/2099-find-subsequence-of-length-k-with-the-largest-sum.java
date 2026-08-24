class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int[] arr = new int[k];
        int idx = 0;

        // Get the k largest values
        int[] largest = new int[k];
        for (int i = nums.length - k; i < nums.length; i++) {
            largest[idx++] = sorted[i];
        }

        // Restore original order
        idx = 0;
        for (int num : nums) {
            for (int j = 0; j < k; j++) {
                if (largest[j] == num) {
                    arr[idx++] = num;
                    largest[j] = Integer.MIN_VALUE; // mark as used
                    break;
                }
            }
        }

        return arr;
    }
}