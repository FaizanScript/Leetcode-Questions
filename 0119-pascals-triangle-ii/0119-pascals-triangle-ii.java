class Solution {
    public List<Integer> getRow(int rowIndex) {

    // Brute Force Solution
        // ArrayList<Integer> currentRow = new ArrayList<>(List.of(1));

        // for (int i = 1; i <= rowIndex; i++) {

        //     ArrayList<Integer> newRow = new ArrayList<>();
        //     newRow.add(1);

        //     for (int j = 1; j < currentRow.size(); j++) {
        //         newRow.add(currentRow.get(j - 1) + currentRow.get(j));
        //     }

        //     newRow.add(1);

        //     currentRow = newRow;
        // }

        // return currentRow;

        // Optimal solution
        ArrayList<Integer> ans = new ArrayList<>();

        // the first element of the array is always 1
        ans.add(1);

        // Compute the rest of the elements using the combination formula:
        // C(n, k) = C(n, k-1) * (n - k + 1) / k
        long current = 1;
        for (int i = 1; i <= rowIndex; i++) {
            current = current * (rowIndex - i + 1) / i;
            ans.add( (int) current);
        }

        return ans;
        
    } 
}