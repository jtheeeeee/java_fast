package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName){
        this.memberId=memberId;
        this.memberName=memberName;
    }
    public Member(){}
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return memberId;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Member){
            Member member = (Member)obj;
            if(this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    //comparator를 사용할 때
    //Member에 comparator를 구현했으므로 TreeSet을 생성할때
    //알려주어야함..
    //Comparator<Member>
    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId)*-1;
    }
/*  Comparable<Member>
    일반적으로는 Comparable을 씀..
    @Override
    public int compareTo(Member member) {
        //오름차순 정렬, 내림차순으로 하고 싶으면 -1과 1을 바꾸면 됨.
        if( this.memberId > member.memberId)
            return 1;
        else if(this.memberId <member.memberId)
            return -1;
        else return 0;
        //아래와 같이 쓸 수도 있음
        //return (this.memberId - member.memberId);   //오름차순
        //return (this.memberId - member.memberId) *  (-1);   //내림 차순
    }

 */
}
