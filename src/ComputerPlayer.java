import java.util.Random;

public class ComputerPlayer extends Player {
    public int makeGuess() {
        int guess;
        Random random;
        random = new Random();
        guess = random.nextInt(1, 101);
        System.out.println(this.getName()+",  enter your guess: " + guess) ;
        return guess;
    }

    public ComputerPlayer() {
        super("ComputerPlayer");
    }


}
