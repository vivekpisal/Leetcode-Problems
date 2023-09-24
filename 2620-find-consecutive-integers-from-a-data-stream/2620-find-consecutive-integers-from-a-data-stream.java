class DataStream {
    List<Integer> arr = new ArrayList<>();
    int k;
    int value;
    int notE;
    int i,j;
    public DataStream(int value, int k) {
        this.value = value;
        this.k=k;
        this.notE=0;
    }
    
    public boolean consec(int num) {
        boolean ans = true;
        arr.add(num);
        if(num != value) notE++;
        if(arr.size() < k){
            return false;
        }else if(arr.size() == k){
            j=arr.size()-1;
            i=j-k+1;
            if(notE == 0) return true;
            return false; 
        }else{
            if(arr.get(i) != value) notE--;
            i++;
            if(notE == 0) return true;
            return false;
        }
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */