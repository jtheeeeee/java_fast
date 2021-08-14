package ch09;

public abstract class Computer {
    //공통으로 사용하지 않는 메서드는 하위 클래스에게 위임한다.
    public abstract void display();
    public abstract void typing();

    //공콩으로 사용할 메서드는 구현
    public void turnOn(){
        System.out.println("turn on");
    }
    public void turnoff(){
        System.out.println("turn off");
    }

}
