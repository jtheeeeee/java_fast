package ch01;

class Outer2{

    int outNum =100;
    static int sNum =200;


    Runnable getRunnable(final int i){

        final int num =10;

        //1번
        /*class MyRunnable implements Runnable{
            int localNum=1000;
            @Override
            public void run() {
//                i=50;
//                num=20; ==> 둘다 오류남. 가져다 쓸뗴는 오류가 안나는데
                //값을 밖꾸려고 하면 오류가 나는 이유: 메서드가 생성되는 주기와 클래스가 생성되는 주기가 다르기 때문
                //i 랑 num은 호출이 된 후에 사라지는 반면에
                //Runnable을 받은 클래스의 메서드인 run은 언제도 다시 호출될 수 있기 때문에
                //값을 할당받을 수 없어서 안됨.
                //따라서 final로 선언을 해서 값을 바꿀수 없도록 해놓음. 오류 방지;
                //final은 stack에 안잡히고 상수 메모리에 잡힘
                System.out.println("i =" + i); //stack메모리에생성
                System.out.println("num = " +num); //stack메모리에 생성
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

            }
        }
        return new MyRunnable();*/

        //2번
        //바로 Runnable interface를 구현해버림
        return new Runnable(){

            int localNum=1000;
            @Override
            public void run() {

                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

            }
        };
    }
    //3번번
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };

}

public class AnonymousInnerTest {
    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100); //여기서 i랑 num은 사라짐.//메서드 호출이 끝났기 때문에
                                                    //상수화돼서 사용만 가능
        runner.run();
        //익명이너클래스
        out.runnable.run();

    }
}
