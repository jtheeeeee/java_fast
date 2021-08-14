package ch15;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    @Override
    public void order() {
        // 아래 세개중에 사용하면 된다.
        //Sell.super.order();
        //Buy.super.order();
        //아래는 재정의한 것.
        System.out.println("customer order");
    }

    public void hello(){
        System.out.println("hello");
    }
}
