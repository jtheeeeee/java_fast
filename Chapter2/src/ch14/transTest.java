package ch14;

public class transTest {
    public static void main(String [] args){
        Student James=new Student("James",5000);
        Student Tomas = new Student("Tomas",10000);

        Bus bus100=new Bus(100);
        Bus bus500=new Bus(500);
        James.takeBus(bus100);

        Subway subwayGreen=new Subway(2);
        Tomas.takeSubway(subwayGreen);

        James.showInfo();
        Tomas.showInfo();
        bus100.showInfo();
        subwayGreen.showInfo();
        bus500.showInfo();
    }
}
