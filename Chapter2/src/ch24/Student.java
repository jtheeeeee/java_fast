package ch24;

import java.util.ArrayList;

public class Student {
    private int studentNum;
    private String name;
    ArrayList<Subject> subjectList;


    public Student(int studentNum, String name){
        this. studentNum = studentNum;
        this. name = name;
        subjectList= new ArrayList<>();
    }
    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total =0;
        for (Subject s : subjectList){
            total+= s.getScore();
            System.out.println(name+"의 "+s.getName()+"과목 성적은 "+s.getScore()+"입니다.");
        }
        System.out.println(name+"의 총점은 "+total+"입니다.");
    }
}
