package ch18;

public class Company {
    //회사는 유일해야 한다.
    //생성자를 private으로 제공을 해야 아무나 새로운 객체를 만들 수 없다.
    //유일한 객체는 클래스 내부에서 만든다.
    //유일한 객체를 외부에서 사용할 수 있도록 만들어 주어야 한다.--> public method로 만든다.
    // getInstacne()
    private static Company instance = new Company();
    private  Company(){}
    public static Company getInstance(){
        //방어적인 코드
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
