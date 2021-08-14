package ch09;


public class Student {
    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int id, String name){
        this.studentID=id;
        this.studentName=name;

        korea= new Subject();
        math=new Subject();
    }

    public void setKoreaSubject(String name, int score){
        korea.subjectName=name;
        korea.score=score;
    }
    public void setMathSubject(String name, int score){
        math.subjectName=name;
        math.score=score;
    }
    public void showScore(){
        int total=korea.score+math.score;
        System.out.println(studentName+"님의 총점은 "+total+"입니다.");
    }
}
