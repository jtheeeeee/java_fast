package ch14;

public interface Calc {
    double PI =3.14;
    int ERROR = 999999999;

    int add(int num1, int num2);
    int substract (int num1, int num2);
    int times(int num1, int num2);
    int devide(int num1, int num2);

    //Default Method
    default void description(){
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }
    //static Method
    static int total(int [] array){
        int total =0;
        for (int num : array){
            total+=num;
        }
        myStaticMethod();
        return total;
    }

    //private method는 재정의도 안되고 단지 인터페이스 내에서만 사용하기 위해서 만듦
    private void myMethod(){
        System.out.println("myMethod");
    }
    private static void myStaticMethod(){
        System.out.println("myStaticMethod");
    }
}
