class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int sumIndices[] = new int[2];
        int sum = 0;
        while(j >= i){
            sum = numbers[i] + numbers[j];
            if(sum == target){
                sumIndices[0]=i+1;
                sumIndices[1]=j+1;
                break;
            }
            
            if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return sumIndices;
    }
}