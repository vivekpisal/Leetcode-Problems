class MyHashSet {
public:
    vector<list<int>> m;
    int siz=0;
    MyHashSet() {
        siz=1e6+1;
        m.resize(siz);
    }
    
    int hash(int key){
        return key%siz;
    }
    
    list<int> ::iterator search(int key){
        int i=hash(key);
        return find(m[i].begin(),m[i].end(),key);
    }
    
    void add(int key) {
        int i=hash(key);
        if(search(key) != m[i].end())
            return;
        m[i].push_back(key);
    }
    
    void remove(int key) {
        int i=hash(key);
        if(contains(key))
            m[i].erase(search(key));
    }
    
    bool contains(int key) {
        int i=hash(key);
        if(search(key) != m[i].end())
            return true;
        return false;
    }
};

