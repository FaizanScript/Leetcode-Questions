class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int[] ans = new int[friends.length];

        Set<Integer> frnds = new HashSet<>();

        for (int i = 0; i < friends.length; i++) {
            frnds.add(friends[i]);
        }

        int ansIndex = 0;

        for (int i = 0; i < order.length; i++) {
            if (frnds.contains(order[i])) {
                ans[ansIndex] = order[i];
                ansIndex++;
            }
        }

        return ans;
        
    }
}