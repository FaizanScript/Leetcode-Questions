class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // iterating the string array to take every string form left to right
        for (int i = 0; i < strs.length; i++) {
            
            // taking the stringg in index i
            String org = strs[i];

            // converting the string to an array to sort it
            char[] chars = org.toCharArray();

            // Sort the character array alphabetically
            Arrays.sort(chars);

            // Convert it back into a String called key
            String key = new String(chars);

            // Check whether map already contains key
            if (map.containsKey(key)) {
                // add the original word to the existing list, assinging with the key
                map.get(key).add(org);
            } else {
                // Create a new list and store it in the map
                ArrayList<String> group = new ArrayList<>();
                group.add(org);
                map.put(key, group);
            }
        }

        return new ArrayList<>(map.values());


        
    }
}