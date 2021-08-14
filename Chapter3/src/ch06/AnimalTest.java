package ch06;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("animal is moving.");
    }
}

class Human extends Animal{
    @Override
    public void move(){
        System.out.println("Human beings walk on two feet.");
    }
    public void readBook(){
        System.out.println("Human beings read books.");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("Tiger walks on all fours.");
    }

    public void hunting(){
        System.out.println("Tiger hunts.");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("Eagle flies in the sky.");
    }
    public void flying(){
        System.out.println("Eagles use their wings. ");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human(); // 이 객체는 Human의 메서드는 사용할 수 없다.
        Animal tAnimal = new Tiger(); // 이 객체는 Tiger의 메서드는 사용할 수 없다.
        Animal eAnimal = new Eagle(); //
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        //상속이 되고, 상위클래스로 형변환
        //상속을 하게되면 하위 클래스들을 상위 클래스 하나로 핸들링 가능하다.
        //클래스 간의 결합도가 타이트해짐. --> 단점
        //객체는 Animal 타입이지만, 상속받은 클래스에서
        //메서드를 재정의(overriding)했을 경우, 재정의된 메서드가 호출된다.
        //따라서 move의 결과가 각기 다르게 실행되는 것.
        //하지만 각각 Human, Tiger, Eagle의 인스턴스 이지만
        //타입이 Animal이기 때문에 각 클래스의 고유한 메서드는 사용할 수 없다.

        //신기하당 확장성 있는 프로그램을 만들 수 있다.
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList ){
            animal.move();
        }
    }
    public void moveAnimal (Animal animal ){
        animal.move();

    }
}
