package ch16.player;

public class AdvancedLevel extends Playerlevel{
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 하지 못합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 중급자 레벨입니다. *****");
    }
}
