class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int uniqueChar = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
           char c = s.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);
           if(map.get(c) > 1){
               while(uniqueChar < n && map.containsKey(s.charAt(uniqueChar)) && map.get(s.charAt(uniqueChar)) != 1)
                uniqueChar++;
           } 
        }
        return uniqueChar >= n ? -1:uniqueChar;
    }
}