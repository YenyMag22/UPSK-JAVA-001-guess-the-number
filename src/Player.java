import java.util.ArrayList;

public abstract class Player {
    private String name;
    private ArrayList<Integer> guesses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void printAttempts() {
        System.out.println("Attempts: " + this.guesses.toString());
    }

    public void printTotalAttempts() {
        System.out.println("Total Attempts: " + this.guesses.size());
    }

    public void setGuesses(Integer guess) {
        this.guesses.add(guess);
    }

    public int makeGuess() {
        return 0;
    }

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }
}
