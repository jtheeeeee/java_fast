package ch04;

public class VIPCustomer extends Customer {

    // VIP에 대한 내용을 Customer 에 전부 구현하는 것은 좋지 못하다.
    // 상속을 통해서 구체적인 기능을 구현
    double salesRatio;
    private String agentID;

//    public VIPCustomer(){
//        super(0,null);
//        // super() --> 컴파일러가 알아서 넣어줌.
//        // 상위 클래스 생성자 호출가능.
//        // 만약 상위클래스의 기본 생성자가 없으면 명시적으로 상위 클래스 생성자를
//        // 호출해야 한다.
//
//        salesRatio = 0.1;
//        bonusRatio = 0.05;
//        customerGrade ="VIP";
//        System.out.println("VIP생성자 호출");
//
//    }
    public VIPCustomer(int customerId, String customerNmae){
        super(customerId, customerNmae);
        customerGrade="VIP";
        salesRatio=0.1;
        bonusRatio = 0.05;
        System.out.println("VIP(int, String)생성자 호출");


    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
