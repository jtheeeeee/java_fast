package ch14;


public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int devide(int num1, int num2) {
        if (num2 ==0){
            return ERROR;
        }

        return num1/num2;
    }

    public void showInfo(){
        System.out.println("모두 구현했습니다.");
    }
    //이미 정의된 default 메서드를 재정의해서 사용할 수도 있다.

    @Override
    public void description() {
        System.out.println("CompleteCalc에서 재정의된 메서드");
    }

}
