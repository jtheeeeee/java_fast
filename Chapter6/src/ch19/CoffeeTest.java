package ch19;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee ethiopiaCoffee = new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        System.out.println();
        Coffee ethiopiaLatte = new Latte(ethiopiaCoffee);
        ethiopiaLatte.brewing();

        System.out.println();

        Coffee mochaEthiopia = new Mocha(ethiopiaLatte);
        Coffee mochaethiopia2 = new Mocha(new Latte(new EthiopiaAmericano()));
        mochaEthiopia.brewing();
        System.out.println();
        mochaethiopia2.brewing();
        System.out.println();

        Coffee kenyaCoffee = new KenyaAmericano();
        kenyaCoffee.brewing();
        System.out.println();
        Coffee kenyaWhipped = new WhippingCream(kenyaCoffee);
        kenyaWhipped.brewing();
        System.out.println();
        Coffee kenyaCoffee2 = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
        kenyaCoffee2.brewing();

    }

}
