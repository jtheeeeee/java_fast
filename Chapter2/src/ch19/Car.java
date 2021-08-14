package ch19;

public class Car {
    private static int f_carNum=10000;

    private int carNum;

    public int getCarNum() {
        return carNum;
    }

    public Car(){
        f_carNum++;
        carNum=f_carNum;
    }
}
