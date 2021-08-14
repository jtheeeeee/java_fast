package ch08;

public class Client {
    public String clientName;
    public String gender;
    public int age;
    public int height;
    public int weight;

    public Client(){}
    public Client(String clientName, String gender, int age, int height, int weight){
        this.clientName=clientName;
        this.gender=gender;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    public String showClientInfo(){
        return "키가 "+height+"이고, 몸무게가 "+weight+"킬로인 남성이 있습니다. 이름은 "+clientName+"이고, 나이는 "+age+"세입니다.";
    }

}
