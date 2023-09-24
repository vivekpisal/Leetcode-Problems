import java.util.AbstractMap;
class Solution {
    private int minVal(Queue<Map.Entry<Integer,Integer>> minQ,int low,int hi){
        while(minQ.peek().getValue() < low){
            minQ.poll();
        }
        return minQ.peek().getKey();
    }
    private int maxVal(Queue<Map.Entry<Integer,Integer>> maxQ,int low,int hi){
        while(maxQ.peek().getValue() < low){
            maxQ.poll();
        }
        return maxQ.peek().getKey();
    }
    public int longestSubarray(int[] nums, int limit) {
        Queue<Map.Entry<Integer,Integer>> maxQ=new PriorityQueue<>((i,j)->
            j.getKey()-i.getKey()
        );
        Queue<Map.Entry<Integer,Integer>> minQ=new PriorityQueue<>((i,j)->
            i.getKey()-j.getKey()
        );
        int i=0,j=0,n=nums.length,maxLen=0;
        int min=nums[0],max=nums[0];
        while(i < n){
            maxQ.offer(new AbstractMap.SimpleEntry(nums[i],i));
            minQ.offer(new AbstractMap.SimpleEntry(nums[i],i));
            max=maxVal(maxQ,j,i);
            min=minVal(minQ,j,i);
            if(max - min <= limit){
                maxLen = Math.max(i-j+1,maxLen);
            }else{
                while(max - min > limit){
                    j++;
                     max=maxVal(maxQ,j,i);
                        min=minVal(minQ,j,i);
                }
            }
            i++;
        }
        return maxLen;
    }
}