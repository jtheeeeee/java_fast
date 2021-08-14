package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("Lee",40,100);
        TravelCustomer customerKim = new TravelCustomer("Kim",20,100);
        TravelCustomer customerHong = new TravelCustomer("Hong",13,50);

        List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 명단 출력");

        customerList.stream().map(c->c.getName()).forEach(s-> System.out.print(s+"\t"));

        System.out.println("\n여행 비용");
        System.out.println(customerList.stream().mapToInt(c -> c.getPrice()).sum());

        System.out.println("20살 이상인 고객");
        customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s-> System.out.print(s+"\t"));
    }

}
