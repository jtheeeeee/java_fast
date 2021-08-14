package ch14;


import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);
        memberHashMap.showAllMember();

        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        System.out.println(hashMap);

        //TreeMap은 haspMap같이 key-value형태로 저장이 되지만 tree와 같은 형식으로 정렬이 된다.

    }
}
