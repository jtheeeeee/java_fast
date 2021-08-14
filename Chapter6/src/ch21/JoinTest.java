package ch21;

public class JoinTest extends  Thread{
    int start;
    int end;
    int total;//멤버변수라 초기화하지 않아도 0이다.
    //지역변수는 초기화해줘야함.
    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        int i;
        for (i=start; i<=end ; i++){
            total+=i;
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread()+"start");
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest( 51,100);
        jt1.start();
        jt2.start();
        //join을 걸면 jt1 쓰레드와 jt2쓰레드가 끝날때까지 main 쓰레드를 실행하지 않음.
        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //main 쓰레드드
       int lastTotal = jt1.total+jt2.total;
        System.out.println(jt1.total);
        System.out.println(jt2.total);
        System.out.println(lastTotal);

    }
}
