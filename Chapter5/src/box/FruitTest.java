package box;

public class FruitTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();

        Box<Apple> appleBox = new Box<>();
        Box<Banana> bananaBox = new Box<>();
//        appleBox.setItem(apple);
//        bananaBox.setItem(banana);
        appleBox.setItem(new Apple());
        bananaBox.setItem(new Banana());
        System.out.println(appleBox);
        System.out.println(bananaBox);


    }
}
