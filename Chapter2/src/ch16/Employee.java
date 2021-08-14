package ch16;

public class Employee{

    private static int serialNum =1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(){
        serialNum++;
        employeeId =serialNum;

    }

    public static int getSerialNum() {
        int i =0; // i는 지역변수, 함수가 사라지면 사라지는 변수
        //employeeName="lee"; ==> 에러, 인스턴스 변수이기 때문에
        //static method는 인스턴스 생성 전에 호출될 수 있기 때문에 인스턴스 변수를 사용할 수 없다.
        //static 변수는 사용 가능하다.

        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
