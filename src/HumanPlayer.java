import java.util.Scanner;

public class HumanPlayer extends Player {
    public int makeGuess() {
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println(this.getName()+",  enter your guess: ") ;
        guess = sc.nextInt();
        this.setGuesses(guess);
        return guess;
    }

    public HumanPlayer() {
        super(" ");
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Welcome, enter your name: ");
        name = sc.next();
        this.setName(name);
    }
}