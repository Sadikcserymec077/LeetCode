
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int[] arr = new int[friends.length];
        boolean[] isFriend = new boolean[n + 1];

        for (int id : friends) {
            isFriend[id] = true;
        }

        int k = 0;
        
        for (int i = 0; i < n; i++) {
            if (isFriend[order[i]]) {
                arr[k++] = order[i];
            }
        }

        return arr;
    }
}
