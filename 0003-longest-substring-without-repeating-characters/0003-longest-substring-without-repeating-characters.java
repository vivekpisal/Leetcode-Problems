class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int longSub = 0,start=0;
        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            while(set.contains(currChar)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(currChar);
            longSub = Math.max(longSub,i-start+1);
        }
        return longSub;
    }
}