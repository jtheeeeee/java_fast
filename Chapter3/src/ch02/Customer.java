package ch02;

public class Customer {

    //하위클래스에서만 접근 가능
    //외부 클래스 접근 불가능
    protected int customerId;
    protected String customerNmae;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNmae() {
        return customerNmae;
    }

    public void setCustomerNmae(String customerNmae) {
        this.customerNmae = customerNmae;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
//
//    public Customer(){
//        customerGrade ="SILVER";
//        bonusRatio = 0.01;
//        System.out.println("Customer 생성자 호출");
//    }
    public int calcPrice(int price){
        bonusPoint +=price*bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        return customerNmae+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
    }

    public Customer(int customerId, String customerNmae){
        this.customerId =customerId;
        this.customerNmae=customerNmae;
        customerGrade ="SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 생성자 호출");

    }
}
