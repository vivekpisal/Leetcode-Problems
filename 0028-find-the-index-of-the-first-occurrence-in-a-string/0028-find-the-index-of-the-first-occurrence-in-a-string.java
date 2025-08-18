class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            char x = haystack.charAt(i),y = needle.charAt(0);
            int start = i;
            if(x == y){
                for(int j=0;j<needle.length() && i < haystack.length();j++,i++){
                    x = haystack.charAt(i);
                    y = needle.charAt(j);
                    if(x != y)
                        break;
                    if(j == needle.length()-1)
                        return start;
                }
            }
            i = start;
        }
        return -1;
    }
}