package ch12;

public class  MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");


        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);

        //중복 값이 들어감 이유는 HashSet을 쓸때 클래스 안에서 중복 체크를 안해줬기 때문에
        // 따라서 HashSet을 사용할때는 관리하는 클래스에 중복 체크하는 기능을 넣어주어야함.
        //equals 랑 hashCode를 구현해주어야함.
        //물리적으로 다르지만 논리적으로는 같다를 구현해주어야함.
        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
        //euqals랑 hashCode를 구현한 후에는 홍길동이 들어가지 않는다.


    }
}
