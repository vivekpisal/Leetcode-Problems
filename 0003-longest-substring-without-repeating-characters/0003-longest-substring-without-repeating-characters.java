class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longStr=0,i=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int j=0;j<s.length();j++){
            while(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }
            map.put(s.charAt(j),j);
            longStr = Math.max(longStr,j-i+1);
        }
        return longStr;
    }
}