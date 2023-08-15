class Solution {
    public int longestPalindrome(String[] words) {
        int cnt=0;
        Map<String,Integer> map = new HashMap<>();
        boolean flag=false;
        int len = 0;
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev=word.charAt(1) +""+ word.charAt(0);
            if(word.charAt(0) != word.charAt(1)){
                if(map.containsKey(word) && map.containsKey(rev)){
                    cnt=Math.min(map.get(word),map.get(rev));
                    len+=cnt*4;
                    map.remove(rev);
                    map.remove(word);
                }
            }else if(word.charAt(0) == word.charAt(1)){
                if(map.containsKey(word)){
                if(map.get(word)%2 == 0){
                    cnt=map.get(word);
                    len+=cnt*2;
                }else{
                    if(flag == false){
                        cnt=map.get(word);
                        len+=cnt*2;
                        flag=true;
                    }else{
                        cnt=map.get(word)-1;
                        len+=cnt*2;
                    }
                }
                map.remove(word);}
            }
        }
        return len;
    }
}