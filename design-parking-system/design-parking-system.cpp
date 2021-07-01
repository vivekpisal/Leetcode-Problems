class ParkingSystem {
public:
    vector<int> size;
    vector<int> tempsize={0,0,0};
    ParkingSystem(int big, int medium, int small) {
        size.push_back(big);
        size.push_back(medium);
        size.push_back(small);
    }
    
    bool addCar(int carType) {
        if(tempsize[carType-1] >= size[carType-1])
            return false;
        tempsize[carType-1]++;
        return true;
    }
};