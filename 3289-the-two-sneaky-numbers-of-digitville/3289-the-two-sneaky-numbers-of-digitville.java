class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] arr = new int[2];
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        int index = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 2) {
                arr[index] = entry.getKey();
                index++;
            }
        }

        return arr;

    }
}