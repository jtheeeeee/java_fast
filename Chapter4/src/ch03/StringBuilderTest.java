package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));//1번
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));//2번
        //1번과 2번의 hashcode값은 같음

        String test = buffer.toString();;
        System.out.println(test);

    }
}
