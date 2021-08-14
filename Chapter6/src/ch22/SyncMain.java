package ch22;

//Bank 자체가 shared resource
class Bank{
    private int money = 10000;
    //synchronized : 하나씩 실행이 된다,,, 대충 몬소린지 알지 태희야,,,
    /*public synchronized void saveMoeny(int save){
        int m = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m+save);

    }*/
    //객체에 lock을 거는 방식
    public  void saveMoeny(int save){
        synchronized (this){
            int m = getMoney();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setMoney(m+save);
        }
    }
    public synchronized  void minusMoney(int minus){
        int m = getMoney();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m-minus);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread{

    public void run(){
        System.out.println("start save");
        SyncMain.myBank.saveMoeny(3000);
        System.out.println("Save Money 3000 : "+SyncMain.myBank.getMoney());
    }

}

class ParkWife extends Thread{
    public void run(){
        System.out.println("start minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("Minus Money 1000 : "+SyncMain.myBank.getMoney());
    }
}


public class SyncMain {

    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        Park p = new Park();
        p.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ParkWife pw = new ParkWife();
        pw.start();
    }
}
