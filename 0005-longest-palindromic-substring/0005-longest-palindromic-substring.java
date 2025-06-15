class Solution {
    public String longestPalindrome(String s) {
        String longPal = "";
        for(int i=0;i<s.length();i++){
            int even = expandAroundCenter(s,i,i+1);
            if(even > longPal.length()){
                int dis = even / 2;
                longPal = s.substring(i-dis+1,i+dis+1);               
            }
            int odd = expandAroundCenter(s,i,i);
            if(odd > longPal.length()){

                int dis = odd/2;
                longPal = s.substring(i-dis,i+dis+1);
            }
        }
        return longPal;
    }

    public static int expandAroundCenter(String s,int left,int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}