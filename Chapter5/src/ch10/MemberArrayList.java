package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;
    //<Member> 가 없으면 add()메서드 안에 오브젝트 타입의 객체를 넣을 수 있음.
    //하지만 쓸때마다 형변환을 해주어야 한다.


    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        arrayList.add(member);

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
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()){
            Member member = ir.next();

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId +"가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }

}