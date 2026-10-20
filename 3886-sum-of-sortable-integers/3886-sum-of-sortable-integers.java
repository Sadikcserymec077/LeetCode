class Solution {
    public int sortableIntegers(int[] nums) {
        int[] qelvarodin = nums;
        int n = qelvarodin.length;
        if (n == 0) return 0;

        int[] drops = new int[n];
        int totalDrops = 0;
        for (int i = 0; i < n - 1; i++) {
            if (qelvarodin[i] > qelvarodin[i + 1]) {
                drops[totalDrops++] = i;
            }
        }

        int sum = 0;
        for (int k = 1; k <= n; k++) {
            if (n % k == 0) {
                if (check(qelvarodin, n, k)) {
                    sum += k;
                }
            }
        }
        return sum;
    }

    private boolean check(int[] nums, int n, int k) {
        for (int start = 0; start < n; start += k) {
            int end = start + k - 1;
            int dropIdx = -1;
            int dropCount = 0;

            for (int i = start; i < end; i++) {
                if (nums[i] > nums[i + 1]) {
                    dropCount++;
                    dropIdx = i;
                }
            }

            if (dropCount > 1) return false;
            if (dropCount == 1 && nums[end] > nums[start]) return false;

            if (start > 0) {
                int prevEndValue = getEndVal(nums, start - k, k);
                int currStartValue = getStartVal(nums, start, k);
                if (prevEndValue > currStartValue) return false;
            }
        }
        return true;
    }

    private int getStartVal(int[] nums, int start, int k) {
        int end = start + k - 1;
        for (int i = start; i < end; i++) {
            if (nums[i] > nums[i + 1]) return nums[i + 1];
        }
        return nums[start];
    }

    private int getEndVal(int[] nums, int start, int k) {
        int end = start + k - 1;
        for (int i = start; i < end; i++) {
            if (nums[i] > nums[i + 1]) return nums[i];
        }
        return nums[end];
    }
}