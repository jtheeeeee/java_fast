package ch16.player;

public class Player {
    private Playerlevel playerlever;
    public Player(){
        playerlever = new BeginnerLevel();
    }
    public void play(int count){
        playerlever.go(count);
    }
    public void upgradeLevel(Playerlevel playerlevel){
        this.playerlever=playerlevel;
    }



}
