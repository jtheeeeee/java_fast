package ch16.player;

public abstract class Playerlevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    final public void go(int count){
        showLevelMessage();
        run();
        for (int i=0; i<count; i++){
            jump();
        }
        for (int i=0; i<count; i++){
            turn();
        }


    }

}
