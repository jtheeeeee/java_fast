package ch15;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = new Customer(); //업캐스팅
        //Buy 타입이기 때문에 Buy에 정의된 메서드만 사용할 수 있음.
        buyer.buy();
        //order는 재정의 되었기 때문에 재정의된 결과로 나온다.
        buyer.order();

        Sell seller = new Customer();
        //Sell 타입이기 때문에 sell에 정의된 메서드만 사용할 수 있음.
        seller.sell();
        //order는 재정의 되었기 때문에 재정의된 결과로 나온다.
        seller.order();
    }

}
