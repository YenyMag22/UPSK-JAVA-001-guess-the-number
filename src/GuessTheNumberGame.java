import java.util.Random;


public class GuessTheNumberGame {
    private int targetNumber;
    private Random random;

    boolean checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess == this.targetNumber) {
            System.out.println("You guessed the number: " + this.targetNumber);
            player.printAttempts();
            player.printTotalAttempts();
            return true;
        } else {
            if (this.targetNumber > guess) {
                System.out.println("Too low!");
            } else if (this.targetNumber < guess) {
                System.out.println("Too High!!");
            }
            return false;
        }
    }

    public int getTargetNumber() {
        return this.targetNumber;
    }

    public GuessTheNumberGame() {
        this.random = new Random();
        this.targetNumber = random.nextInt(1, 101);
    }


    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        Player player;
        int round = 1;
        player = humanPlayer;
        System.out.println(game.getTargetNumber());
        System.out.println("--- Round: " + player.getName() + " ---");
        while (game.checkGuess(player) == false) {
            if (round % 2 == 0) {
                player = humanPlayer;
            } else {
                player = computerPlayer;
            }
            System.out.println("--- Round: " + player.getName() + " ---");
            round++;

        }
    }
}                                        
//