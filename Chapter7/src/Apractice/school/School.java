package Apractice.school;

import java.util.ArrayList;

public class School {
    private static School instance = new School();
    private static String SCHOOL_NAME= "GOOD SCHOOL";
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();

    private School(){}
    public static School getInstance(){
        if (instance == null){
            instance = new School();
        }
        return instance;
    }



    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void addSubject(Subject subject){
        this.subjectList.add(subject);
    }
}
