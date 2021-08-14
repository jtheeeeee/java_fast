package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;
    //<Member> 가 없으면 add()메서드 안에 오브젝트 타입의 객체를 넣을 수 있음.
    //하지만 쓸때마다 형변환을 해주어야 한다.


    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public MemberHashSet(int size) {
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member) {
        hashSet.add(member);

    }

    public boolean removeMember(int memberId) {
/*        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId +"가 존재하지 않습니다.");
        return false;*/
        Iterator<Member> ir = hashSet.iterator();
        while(ir.hasNext()){
            Member member = ir.next();

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId +"가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }

}