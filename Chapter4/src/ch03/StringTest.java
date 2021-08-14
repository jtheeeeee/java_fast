package ch03;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        //1번
        System.out.println(System.identityHashCode(java));
        java=java.concat(android);
        System.out.println(java);
        //2번
        System.out.println(System.identityHashCode(java));
        //1번과 2번의값이 다르다. ==> 스트링빌더, 스트링버퍼를 사용한다.
    }
}
