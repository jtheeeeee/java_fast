package ch19;

public class Latte extends Decorator{
    public Latte(Coffee coffee) {
        super(coffee);
        //상위 클래스에 디폴트 생성자가 없기 때문에
        //하위 클래스가 상위 클래스를 상속받아 생성자를 호출할때
        //매개변수가 있는 생성자를 명시적으로 호출해주어야 한다.
    }
    public void brewing(){
        super.brewing();
        System.out.print(" Adding Milk");
    }
}
