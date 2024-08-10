class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.length()-1;
        while(lastIndex >= 0 && s.charAt(lastIndex) != ' '){
            lastIndex--;
        }
        return s.length()-lastIndex-1;
    }
}