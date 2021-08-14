package ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        //static 변수는 클래스 이름으로 참조해서 많이 사용한다.
        System.out.println(Employee.getSerialNum());

        Employee employeeKim =  new Employee();
        employeeKim.setEmployeeName("김유신");
//        employeeKim.serialNum++;

        //값이 같음. 하나의 변수를 공유하기 때문
        System.out.println(employeeLee.getEmployeeName()+"님의 사번: "+employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+"님의 사번: "+employeeKim.getEmployeeId());
    }
}
