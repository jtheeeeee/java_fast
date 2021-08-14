package ch07;

public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        //타입 지정을 안하면 Object로 인지함.쓸때 형변환 해주면 된다.
        //<> : 컬렉션프레임워크에 들어가면 정말 많이 씀.
        powderPrinter.setMaterial(powder);

        Powder p =powderPrinter.getMaterial();// 형변환하지 않는다.
        System.out.println(powderPrinter.toString());


    }
}
