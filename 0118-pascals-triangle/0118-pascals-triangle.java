class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTri = new ArrayList<>();
        pascalTri.add(List.of(1));
        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(pascalTri.get(i-1).get(j-1)+pascalTri.get(i-1).get(j));
            }
            list.add(1);
            pascalTri.add(list);
        }
        return pascalTri;
    }
}