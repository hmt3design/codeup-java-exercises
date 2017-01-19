import java.util.Random;
import java.util.Scanner;

/**
 * Created by Harry on 1/18/17.
 */
public class RPSGameApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        Validator validator = new Validator( scan );
        String player1;

        System.out.println( "Jun Ken Po, a.k.a. Rock Paper Scissors" );
        System.out.println( "Your name, please? " );
        player1 = scan.nextLine();
        startGame( player1 );
    }

    public static void startGame(String player1) {
        Scanner scan = new Scanner( System.in );
        Validator validator = new Validator( scan );
        Random random = new Random();
        String player1Turn;
        String computer1;
        int computerTurn;

        // Select option RPS
        System.out.println( "Using R)Rock, P)Paper or S)Scissors, make a selection:" );
        player1Turn = scan.nextLine();
        player1Turn = Roshambo.fromString( player1Turn.toUpperCase() ).toString();

        // Generate computer turn
        computerTurn = random.nextInt( 3 ) + 1;
        computer1 = Roshambo.fromNumber( computerTurn ).toString();

        // Determine the winner
        if (player1Turn.equals(computer1)) {
            System.out.println("It's a tie.");
        }
        else if (player1Turn.equals("R")) {
            if (computer1.equals("S"))
                System.out.println("Rock crushes scissors. " + player1 + " wins.");
            else if (computer1.equals("P"))
                System.out.println("Paper eats rock. Computer wins");
        }
        else if (player1Turn.equals("P")) {
            if (computer1.equals("S"))
                System.out.println("Scissor cuts paper. Computer wins");
            else if (computer1.equals("R"))
                System.out.println("Paper eats rock. " + player1 + " wins.");
        }
        else if (player1Turn.equals("S")) {
            if (computer1.equals("P"))
                System.out.println("Scissor cuts paper. " + player1 + " wins.");
            else if (computer1.equals("R"))
                System.out.println("Rock breaks scissors. Computer wins");
        }
        else
            System.out.println("Not a valid option.");
        if (validator.playAgain() == true) {
            startGame(player1);
        } else System.out.println("Thank you for playing!");
    }
}
