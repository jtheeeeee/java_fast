package ch09;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseable obj = new AutoCloseableObj();

        try(obj){
            throw new Exception();//예외 강제발생
        }catch(Exception e){
            System.out.println("exeption");
        }
        System.out.println("end");
    }

}
