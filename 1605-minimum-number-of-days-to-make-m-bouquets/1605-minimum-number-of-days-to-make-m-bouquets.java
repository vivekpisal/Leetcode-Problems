class Solution {
    private int howManyBouquets(int bloomDay[],int m,int k,int day){
        int noOfBou=0;
        int adjK=k;
        for(int i=0;i<bloomDay.length;i++){
            if(day >= bloomDay[i]){
                adjK--;
            }else{
                adjK=k;
            }
            if(adjK == 0){
                noOfBou++;
                adjK=k;
            }
        }
        return noOfBou;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int lo=1,hi=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        while(lo <= hi){
            int mid=(lo + hi)/2;
            int bou = howManyBouquets(bloomDay,m,k,mid);
            if(bou == m){
                ans=mid;
                hi=mid-1;
            }else if(bou > m){
                ans=mid;
                hi=mid-1;
            }else if(bou < m){
                lo=mid+1;
            }
        }
        return ans;
    }
}