package ch04;

public class StudentTest {
    public static void main(String [] args){

        //student는 변수형이 Student 이다.
        //Student 클래스는 사이즈가 int, float같이 사이즈가 정해져있지 않음.
        //Student() = 생성자
        //student1 은 인스턴스라고 말한다. Student 객체의 인스턴스가 여러개가 만들어질 수 있음.
        Student student1 =  new Student();
        //type은 Student 변수명: student1
        student1.studentID=12345;
        student1.setStudentName("Lee");
        student1.address="서울 강남구";

        student1.showStudentInfo();

        Student student2 = new Student();
        student2.studentID=54321;
        student2.studentName="Kim";
        student2.address="경기도 성남시";

        student2.showStudentInfo();


    }
}
