package ch02;

//어노테이션은 컴파일러에게 알려주는 것. 사전에 오류를 막아줌.
//FunctionalInterface는 메서드를 2개이상 선언해서는 안된다.
//람다식을 쓰기위한 FunctionalInterface는 하나의 메서드만 선언해야함
@FunctionalInterface
public interface Add {
    public int add(int x , int y);
}
