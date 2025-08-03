class Solution {
    public boolean isPalindrome(String str,int i,int j){
        int start = i,end = j;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void palPartition(String s,int idx,List<String> pal,List<List<String>> palPar){
        if(idx == s.length()){
            palPar.add(new ArrayList<>(pal));
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                pal.add(s.substring(idx,i+1));
                palPartition(s,i+1,pal,palPar);
                pal.remove(pal.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> palPar = new ArrayList<>();
        List<String> pal = new ArrayList<>();
        palPartition(s,0,pal,palPar);
        return palPar;
    }
}