class Solution {
    public String longestCommonPrefix(String[] strs) {
        String comPref = strs[0];
        for(int i=1;i<strs.length;i++){
            int minLen = Math.min(comPref.length(),strs[i].length());
            int maxCommon = 0;
            for(int j=0;j<minLen;j++){
                if(comPref.charAt(j) == strs[i].charAt(j)){
                    maxCommon = j+1;
                }else{
                    break;
                }
            }
            comPref = maxCommon == 0 ? "" : comPref.substring(0,maxCommon);
        }
        return comPref;
    }
}