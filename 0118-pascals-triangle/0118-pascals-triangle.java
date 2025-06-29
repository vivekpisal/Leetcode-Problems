class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(List.of(1));
        for(int i=2;i<=numRows;i++){
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            int lastRow = pascal.size()-1;
            for(int j=0;j<pascal.get(lastRow).size()-1;j++){
                nextRow.add(pascal.get(lastRow).get(j) + pascal.get(lastRow).get(j+1));
            }
            nextRow.add(1);
            pascal.add(nextRow);
        }
        return pascal;
    }
}