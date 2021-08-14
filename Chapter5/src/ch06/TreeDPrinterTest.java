package ch06;

public class TreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        TreeDPrinter3 printer3 = new TreeDPrinter3();
        printer3.setMaterial(powder);
        //object를 써도 되지만 캐스팅 해주어야 한다는 번거로움이 있다.
        Powder p = (Powder)printer3.getMaterial();
        //<T>: 자료형 매개변수를 사용한다.
        //E, K, V 의미에 맞춰 쓴다. 아무거나 써도 상관없긴하다.


    }
}
