class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1); 
            for (int j = 1; j < i; j++) {
                row.add(t.get(i - 1).get(j - 1) + t.get(i - 1).get(j));
            }
            if (i > 0) row.add(1); 
            t.add(row);
        }
        return t;
    }
}