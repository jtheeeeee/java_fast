package ch19;
//상속을 위한 상위클래스
public abstract class Decorator extends Coffee{

    Coffee coffee;
    public Decorator(Coffee coffee){
        this.coffee = coffee;

    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
