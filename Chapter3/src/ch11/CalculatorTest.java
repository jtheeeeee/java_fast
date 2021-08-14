package ch11;

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

    }
}
