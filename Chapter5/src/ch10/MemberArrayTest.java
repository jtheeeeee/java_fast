package ch10;

public class MemberArrayTest {
    public static void main(String[] args) {
        MemberArrayList memberArraylist = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");


        memberArraylist.addMember(memberHong);
        memberArraylist.addMember(memberLee);
        memberArraylist.addMember(memberKim);
        memberArraylist.addMember(memberKang);

        memberArraylist.showAllMember();
        memberArraylist.removeMember(memberKim.getMemberId());
        memberArraylist.showAllMember();

    }
}
