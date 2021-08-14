package ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

//        StringConcatImpl strImpl = new StringConcatImpl();
//        strImpl.makeString(s1, s2);
        StringConcat concat = (s, v) -> System.out.println( s+ "," + v);
        concat.makeString(s1,s2);
        //클래스 없이 만들어지는게 아니라 아래와같이 내부적으로 익명 내부 클래스가 만들어짐
        //클래스를 생성하는 과정이 생략됨;
        StringConcat concat2 = new StringConcat(){

            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + ",,," + s2);
            }
        };
        concat2.makeString(s1,s2);
    }
}
