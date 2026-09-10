class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

              List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            boolean canHaveGreatest = true;

            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    canHaveGreatest = false;
                    break;
                }
            }

            result.add(canHaveGreatest);
        }

        return result;
        
    }
}