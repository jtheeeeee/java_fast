package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;
    //<Member> 가 없으면 add()메서드 안에 오브젝트 타입의 객체를 넣을 수 있음.
    //하지만 쓸때마다 형변환을 해주어야 한다.


    public MemberTreeSet() {
        //Comparable을 쓸때는
        //treeSet = new TreeSet<>(); 이라고 써도 상관 없다.
        //하지만 Comparator를 쓸때는 아래와 같이
        //TreeSet Constructor 안에 어디에 Comparator 를 구현해 놓았는지 지정해주어야함..
        treeSet = new TreeSet<Member>(new Member());
    }


    public void addMember(Member member) {
        treeSet.add(member);

    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = treeSet.iterator();
        while(ir.hasNext()){
            Member member = ir.next();

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId +"가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }

}