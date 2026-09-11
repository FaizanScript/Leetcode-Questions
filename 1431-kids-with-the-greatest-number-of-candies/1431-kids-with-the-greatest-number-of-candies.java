class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

              List<Boolean> result = new ArrayList<>();

              int maxcandy = candies[0];

        for (int i = 0; i < candies.length; i++) {
            
            if (candies[i] > maxcandy) {
                maxcandy = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxcandy);
        }

        return result;
        
    }
}