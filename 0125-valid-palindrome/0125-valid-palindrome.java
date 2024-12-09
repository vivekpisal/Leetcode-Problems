class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        s.chars().filter(c -> (c >= 97 && c <= 122 || c >= 48 && c <= 57)).mapToObj(c -> (char) c).forEach(str::append);
        s = str.toString();
        int i=0,j=s.length()-1;
        while(j >= i){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}