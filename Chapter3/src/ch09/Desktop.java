package ch09;

public class Desktop extends Computer{
    //추상 메서드를 모두 구현해주어야 함.
    @Override
    public void display(){
        System.out.println("Desktop display");
    }
    @Override
    public void typing(){
        System.out.println("Desktip typing");
    }
    //상위클래스에서 구현된 메서드를 필요에 따라 하위 클래스 다시 재정의해도 된다.

    @Override
    public void turnoff() {
        System.out.println("Desktop turnOff");
    }
}
