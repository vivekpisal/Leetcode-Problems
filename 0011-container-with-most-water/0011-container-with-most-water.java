class Solution {
    public int maxArea(int[] height) {
        int mostWater = 0;
        int i=0,j=height.length-1;
        while(j > i){
            mostWater = Math.max(mostWater,Math.min(height[i],height[j]) * (j-i));
            if(height[j] > height[i])
                i++;
            else
                j--;
        }
        return mostWater;
    }
}