package Day52;

//https://leetcode.com/problems/design-parking-system/

class ParkingSystem {
    static int big;
    static int medium;
    static int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1 && big > 0) {
            big--;
            return true;
        } else if(carType == 2 && medium > 0) {
            medium--;
            return true;
        } else if(carType == 3 && small > 0) {
            small--;
            return true;
        } else return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
public class Leetcode1603 {
    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(2, 1, 1);
        boolean param_1 = obj.addCar(1);
    }
}
