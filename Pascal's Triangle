class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int rowNum = 1;
        for (int i = rowNum; i <= numRows; i++, rowNum++) {
            List<Integer> row = new ArrayList<Integer>(rowNum);
            for (int j = 0; j < rowNum; j++) {
                if (j == 0 || j == rowNum - 1) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = result.get((rowNum-1) - 1);
                    int sum = prevRow.get(j) + prevRow.get(j - 1);
                    row.add(sum);
                }
            }
            result.add(row);
        }
        return result;
    }
}
