class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> record = new ArrayList<>();

            for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("C") &&
                !operations[i].equals("D") &&
                !operations[i].equals("+")) {

                record.add(Integer.parseInt(operations[i]));

            } else if (operations[i].equals("C")) {
                record.remove(record.size() - 1);

            } else if (operations[i].equals("D")) {
                record.add(2 * record.get(record.size() - 1));

            } else {
                record.add(
                    record.get(record.size() - 1) +
                    record.get(record.size() - 2)
                );
            }
        }

        int sum = 0;
        
        for (int num : record) {
            sum += num;
        }

        return sum;
        
    }
}