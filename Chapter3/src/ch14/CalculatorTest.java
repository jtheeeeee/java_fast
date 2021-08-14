package ch14;


public class CalculatorTest {
    public static void main(String[] args) {
        //CompleteCalc는 Calc의 타입을 상속했다. 구현상속과는 다르다.
        //구현상속은 구현 코드를 받은거고, 타입상속은 타입을 상속받은 것.

        int num1 = 10;
        int num2=2;
        Calc calc = new CompleteCalc();
        //하지만 Calc 변수이기 때문에 showInfo() 메서드는 사용할 수 없다.
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.devide(num1, num2));

        CompleteCalc cCalc = new CompleteCalc();
        cCalc.showInfo();

        //재정의되었기 때문에 재정의된 결과가 나온다.
        //private method를 추가했지만 재정의 되었기 때문에 private method는 호출되지 않는다.
        cCalc.description();

        //static 메서드는 인스턴스와 상관없이 작동.
        //인터페이스이름.메서드 --> 이런 형식으로 사용하면됨.
        int [] arr = {1,2,3,4,5};
        //total은 재정의 되지 않았기 때문에 private method가 호출되었다.
        System.out.println(Calc.total(arr));



    }
}
