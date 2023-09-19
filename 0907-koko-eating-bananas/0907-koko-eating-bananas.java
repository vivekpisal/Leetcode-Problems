class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st=1,end=Arrays.stream(piles).max().getAsInt();
        int mid=0,ans=0;
        while(st <= end){
            mid=(st+end)/2;
            long hours=0;
            for(int i=0;i<piles.length;i++){
                int d=piles[i]/mid;
                if(piles[i] % mid != 0){
                    d++;
                }
                hours+=d;
            }
            if(hours <= h){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return st;
    }
}