class MyHashSet {
public:
    vector<int> hs;
    int siz=0;
    MyHashSet() {
        siz=1e6+1;
        hs.resize(siz);
    }
    
    void add(int key) {
        hs[key]=1;
    }
    
    void remove(int key) {
        hs[key]=0;
    }
    
    bool contains(int key) {
        return hs[key];
    }
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */