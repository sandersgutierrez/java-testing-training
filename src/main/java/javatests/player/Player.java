package javatests.player;

public class Player {
    private final Dice dice;
    private final int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play() {
        return dice.roll() > minNumberToWin;
    }
}
