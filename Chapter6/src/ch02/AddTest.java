package ch02;

public class AddTest {
    public static void main(String[] args) {

        //interface의 add함수를 구현한 것이다.
        //원래는 인터페이스 선언 - 인터페이스를 구현한 클래스 - 메서드 구현 - 메인에서 불러서씀
        //람다는 인터페이스 구현 - 메인에서 바로 구현해서 사용;
        Add addL = (x, y) -> {return x+y; };
        Add addM = (x, y) -> x+y; //return은 중괄호 생략할 수 없음
        System.out.println(addL.add(2, 4));
        System.out.println(addM.add(2,5));
    }
}
