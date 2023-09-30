class Solution {
    boolean canShipPackages(int[] weights,int maxDays,int maxWeight){
        int weight=maxWeight,days=1;
        for(int i=0;i<weights.length;i++){
            if(weights[i] <= weight){
                weight-=weights[i];
            }else{
                if(weights[i] > maxWeight) return false;
                days++;
                weight=maxWeight;
                weight-=weights[i];
            }
            if(days > maxDays) return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lo=0,hi=Integer.MAX_VALUE-1;
        int mid=0,minWeight=Integer.MAX_VALUE;
        while(lo <= hi){
            mid=(lo+hi)/2;
            boolean canShip = canShipPackages(weights,days,mid);
            if(canShip){
                minWeight=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return minWeight;
    }
}