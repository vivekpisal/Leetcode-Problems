class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                while(map.containsKey(c)){
                    char startChar = s.charAt(start);
                    map.remove(startChar);
                    start++;
                }
            }
            map.put(c,1);
            maxLen = Math.max(maxLen,(i-start)+1);
        }
        return maxLen;
    }
}