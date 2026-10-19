class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { 

        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            seen.add(nums1[i]);
        }

        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (seen.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        return result.stream()
             .mapToInt(Integer::intValue)
             .toArray();

    }
}