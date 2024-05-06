class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        int maxLen=0;
        Map<Character,Integer> map = new HashMap<>();
        while(end < s.length()){
            char endChar = s.charAt(end);
            if(map.containsKey(endChar)){
                while(map.containsKey(endChar)){
                    char startChar = s.charAt(start);
                    map.remove(startChar);
                    start++;
                }
            }
            maxLen = Math.max(maxLen,end-start+1);
            map.put(endChar,1);
            end++;
        }
        return maxLen;
    }
}