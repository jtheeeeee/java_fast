package ch02;

import java.awt.desktop.ScreenSleepEvent;
import java.net.SocketTimeoutException;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std1=new Student(100,"Lee");
        Student std2 = new Student(100,"Lee");
        Student std3 = std1;
        System.out.println(std1==std2); //false 물리적인 메모리 값이 다르기 때문에 false이다.
        System.out.println(std1.equals(std2)); //false, equals 재정의 후에는 true


        //7번째줄에 같은 것으로 복사했기 때문
        System.out.println(std1==std3);//true
        System.out.println(std1.equals(std3));//true

        //hashCode 재정의 전에는 값이 다름.
        System.out.println(std1.hashCode());//2054798982, 재정의 후 100
        System.out.println(std2.hashCode());//885951223, 재정의 후 100(학번)
        //하지만 hashCode를 오버라이딩해서 반환 값을 학번으로 바꿔주면,
        // 논리적 값이 같이 때문에 equals 진행시 true가 나온다.
        System.out.println(System.identityHashCode(std1)); //원래 해시코드

        String str1= new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2)); //true, 같은 해쉬코드 값이 반환되면됨.
        System.out.println(str1.hashCode()); //96354 같은 값.
        System.out.println(str2.hashCode()); //96354

        Integer i =100;
        Integer ii=100;
        System.out.println(i.hashCode()); // 100
        System.out.println(ii.hashCode()); //100
        System.out.println(i.equals(ii));

        std1.setStudentName("KIM");
        Student copyStudent =(Student)std1.clone();
        System.out.println(copyStudent); //implements Cloneable 필요
        // 100, Lee --> toString()을 재정의 헀기 때문


    }
}


