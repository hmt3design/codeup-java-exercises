import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Harry on 1/11/17.
 */
public class BattingStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        Batter batter = new Batter();

        System.out.println("Batting Stats generator");
        System.out.println("Please enter the player's name: ");
        batter.playerName = scan.nextLine();
        System.out.println("Please enter the number of at-bats: ");
        batter.timesAtBat = scan.nextInt();

//        int[] playerStatBases = new int[batter.timesAtBat];
//        for (int i=0; i<=playerStatBases.length; i++) {
//            System.out.println("Please enter the number of bases earned by the player (0, 1, 2, 3, or 4): ");
//            statBases = scan.nextInt(i);
//        }
//        System.out.println(playerName + " has " + statAtBat + " at-bats, with a ");


    }
}