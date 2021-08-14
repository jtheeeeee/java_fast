package ch13;


import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    //원래 String에 이미 compareTo가 이미 구현되어있음.
    @Override
    public int compare(String s1, String s2) {
        //return s1.compareTo(s2); // 원래 String과 같은 것
        return s1.compareTo(s2)*-1; //내림차순
    }



}
public class MemberTreeSetTest {
    public static void main(String[] args) {
/*
//
//        TreeSet<String> set = new TreeSet<String>();
//        set.add("홍길동");
//        set.add("강감찬");
//        set.add("김유신");
//        set.add("홍길동");
//        System.out.println(set); // 정렬이 됨.

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        System.out.println(memberKang.getMemberId());
        System.out.println(memberHong.getMemberId());
        System.out.println(memberKim.getMemberId());
        System.out.println(memberLee.getMemberId());

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.showAllMember();
        // class ch13.Member cannot be cast to class java.lang.Comparable
        //comparable 없으면 오류남. 기준이 없다.

*/
        //comparator를 만들지 않으면 그냥 오름차순 출력
        TreeSet<String> set = new TreeSet<String>(new MyCompare());
        set.add("Park");
        set.add("Kim");
        set.add("Lee");
        System.out.println(set);
    }
}
