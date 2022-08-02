class MyHashMap {
public:
    vector<int> hm;
    int siz;
    MyHashMap() {
        siz=1e6+1;
        hm.resize(siz,-1);
    }
    
    void put(int key, int value) {
        hm[key]=value;
    }
    
    int get(int key) {
        return hm[key];
    }
    
    void remove(int key) {
        hm[key]=-1;
    }
};