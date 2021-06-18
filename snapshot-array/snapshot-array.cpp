class SnapshotArray {
public:
    unordered_map<int,map<int,int>> mp;
    int snap_id=0;
    SnapshotArray(int length) {
        
    }
    
    void set(int index, int val) {
        mp[index][snap_id]=val;
    }
    
    int snap() {
        return snap_id++;
    }
    
    int get(int index, int snap_id) {
        auto it=mp[index].upper_bound(snap_id);
        return it == begin(mp[index]) ? 0 : prev(it)->second;
    }
};
