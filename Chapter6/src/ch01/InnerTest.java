package ch01;

class OutClass{
    private int num =10;
    private static int sNum =20;

    private InClass inClass;
    public OutClass(){
       inClass = new InClass();
    }

    private class InClass{

        int iNum =100;

        //static int sInNum = 500;//오류남
        //생성될 때 OutClass 가 먼저 생성되기 때문에 오류가 난다.
        //static은 변수의 상관 없이 사용이 가능해야 하는데 inClass의 경우 OutClass가 생성되어야 생성될 수 있기 때문에
        //오류가 난다.


        void inTest(){
            System.out.println("OutClass num = " + num + "외부 클래스의 인스턴스 변수");
            System.out.println("OutClass sNum = "+sNum+"외부 클래스의 스태틱 변수");
            System.out.println("InClass iNum = " + iNum + "내부 클래스의 인스턴스 변수");
        }
    }
    public void usingClass(){
        inClass.inTest();
    }

    static class InStaticClass{
        int iNum =100;
        static int sInNum =200;
        void inTest(){

            //System.out.println("OutClass num = " + num + "외부 클래스의 인스턴스 변수");
            //num은 외부 클래스의 인스턴스 변수이기 때문에
            //외부 클래스의 생성과 상관없이 호출되는 static  메서드는 사용할 수 었다.
            //하지만 본인의 인스턴스 변수는 사용 가능함.
            //외부 클래스의 static 변수는 사용할 수 있음
            System.out.println("InClass num = "+sInNum+"내부 클래스의 스태틱 변수");
            System.out.println("OutClass sNum = "+sNum+"외부 클래스의 스태틱 변수");
            System.out.println("InClass iNum = " + iNum + "내부 클래스의 인스턴스 변수");
        }

        static void sTest(){
            System.out.println("InClass num = "+sInNum+"내부 클래스의 스태틱 변수");
            System.out.println("OutClass sNum = "+sNum+"외부 클래스의 스태틱 변수");
            //System.out.println("InClass iNum = " + iNum + "내부 클래스의 인스턴스 변수");
            //static 메서드에서는 내부 클래스의 인스턴스 변수는 또 사용하지 못한다.
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
//        OutClass outClass = new OutClass();
//        outClass.usingClass();


        //InClass가 private이 아닐때 이론적으로는 아래와 같이 사용할 수 있다.
       /* OutClass.InClass inner = outClass.new InClass();
        inner.inTest();*/

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        //외부클래스에서 바로 생성이 가능함.
        sInClass.inTest();

        System.out.println();

        OutClass.InStaticClass.sTest();//정적 메서드는 바로 호출 가능
    }
}
