class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if (numRows <= 0) return pascal;

        pascal.add(List.of(1));

        for (int i = 1; i<numRows; i++) {
            List<Integer> prevRow = pascal.get(i-1);
            List<Integer> curRow = new ArrayList<> (prevRow.size() + 1);
            curRow.add(1);
            for (int j = 1; j<i; j++) {
                curRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            curRow.add(1);
            pascal.add(curRow);
        }
        return pascal;
    }
}