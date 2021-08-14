package ch16.player;

public class SuperLevel extends Playerlevel {
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 Jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}
