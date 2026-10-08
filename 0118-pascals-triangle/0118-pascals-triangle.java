class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }
        return ans;

        
        
    }

    public List<Integer> generateRow(int row) {

        ArrayList<Integer> ansRow = new ArrayList<>();

        // the first element of the row will always be 1
        ansRow.add(1);

        // using long, because when r get multiply by current (any big no) int might not able to store it
        long ans = 1;

        // Compute the rest of the elements using the combination formula:
        // C(n, k) = C(n, k-1) * (n - k + 1) / k
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col) / col;
            ansRow.add( (int) ans);
        }

        return ansRow;

    }
}