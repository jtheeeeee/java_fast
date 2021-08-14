package ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("Turn on the car");
    }
    public void turnOff(){
        System.out.println("Turn off the car");
    }
    //시나리오 -> 변하면 안됨. final 선언
    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
    public void washCar(){} // 구현은 되어있지만 동작이 되지 않음.
    //washCar를 재정의한 클래스에서는 run() 메서드 호출시 작동하지만,
    //재정의하지 않은 클래스는 동작이 구현되어있지 않아 아무일도 일어나지 않는다.
    //재정의 된 것은 실행된다.
    //washCar()와 같은 것을 hook method라고 부른다.
}
