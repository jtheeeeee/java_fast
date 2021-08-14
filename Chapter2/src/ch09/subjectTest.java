package ch09;

public class subjectTest {
    public static void main(String [] args){
        Student studentLee= new Student(100,"태희");
        studentLee.setKoreaSubject("국어",100);
        studentLee.setMathSubject("수학",100);
        Student studentKim= new Student(200,"태희");
        studentKim.setKoreaSubject("국어",50);
        studentKim.setMathSubject("수학",50);
        studentLee.showScore();
        studentKim.showScore();
    }

}
