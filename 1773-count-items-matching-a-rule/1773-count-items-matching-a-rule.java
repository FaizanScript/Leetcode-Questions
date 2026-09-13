class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int column;
        int count = 0;

        if (ruleKey.equals("type")) {
            column = 0;
        } else if (ruleKey.equals("color")) {
            column = 1;
        } else {
            column = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(column).equals(ruleValue)) {
                count++;
            }
        }
        return count;
        
    }
}