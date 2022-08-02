class MyHashMap {
public:
    vector<list<pair<int,int>>> hm;
    int siz;
    MyHashMap() {
        siz=1000;
        hm.resize(siz);
    }
    
    int hash(int key){
        return key%siz;
    }
    
    list<pair<int,int>>::iterator search(int key){
        int i=hash(key);
        list<pair<int,int>>::iterator it=hm[i].begin();
        while(it != hm[i].end()){
            if(it->first == key)
                return it;
            it++;
        }
        return it;
    }
    
    void put(int key, int value) {
        int i=hash(key);
        remove(key);
        hm[i].push_back({key,value});
    }
    
    int get(int key) {
        int i=hash(key);
        list<pair<int,int>>::iterator it=search(key);
        if(it != hm[i].end())
            return it->second;
        return -1;
    }
    
    void remove(int key) {
        int i=hash(key);
        list<pair<int,int>> :: iterator it=search(key);
        if(it != hm[i].end())
            hm[i].erase(it);
    }
};