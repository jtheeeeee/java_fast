package ch02;

public class Student implements Cloneable{
    private int studentNumber;
    private String studentName;

    public Student(int studentNumber, String studentName){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public void setStudentName(String name){
        this.studentName=name;
    }

    public String toString(){
        return studentNumber +", "+studentName;
    }

    @Override
    public int hashCode() {
        return studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student std = (Student)obj;
            if(this.studentNumber == std.studentNumber){
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
