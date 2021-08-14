package Apractice.school.report;

import Apractice.grade.BasicEvaluation;
import Apractice.grade.GradeEvaluation;
import Apractice.grade.MajorEvaluation;
import Apractice.school.School;
import Apractice.school.Student;
import Apractice.school.Subject;
import Apractice.school.Score;
import utills.Define;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();
    public static final String TITLE=" 수강생 학점 \t\t\n";
    public static final String HEADER = "이름  |  학번  | 중점과목 |  점수  \n";
    public static final String LINE = " ------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    public String getReport(){
        ArrayList<Subject> subjectList = school.getSubjectList();
        for(Subject subjec : subjectList){
            makeHeader(subjec);
            makeBody(subjec);
            makeFooter(subjec);
        }
        return buffer.toString();
    }

    private void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();
        for (int i=0; i<studentList.size(); i++){
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName() + "\t");
            buffer.append(" | ");

            getScoreGrade(student, subject.getSubjectId());
            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    private void getScoreGrade(Student student, int subjectId) {
        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        GradeEvaluation [] gradeEvaluations ={new BasicEvaluation(), new MajorEvaluation()};
        for (int i=0; i<scoreList.size(); i++){

            Score score = scoreList.get(i);
            if(score.getSubject().getSubjectId() == subjectId){
                String grade;
                if(score.getSubject().getSubjectId() ==majorId)
                    grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                else
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }

    }

    private void makeFooter(Subject subjec) {
        buffer.append("\n");
    }

    private void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t"+subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);

    }
}
