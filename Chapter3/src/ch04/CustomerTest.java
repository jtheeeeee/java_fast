package ch04;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(100010, "이순신");
        customerLee.setCustomerNmae("이순신");
        customerLee.setCustomerId(100010);
        customerLee.bonusPoint=1000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(100020, "김유신");
        customerKim.setCustomerNmae("김유신");
        customerKim.setCustomerId(100020);
        customerKim.bonusPoint=10000;
        System.out.println(customerKim.showCustomerInfo());

        Customer vc= new VIPCustomer(12345,"noname");
        //vc.agentID; ==> 안됨, VIP의 인스턴스로 만들어졌지만
        // Customer로 형변환 되었기 때문에 VIPCustomer의 속성은 쓸 수 없다.
    }

}
