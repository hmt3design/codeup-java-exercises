import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Harry on 1/11/17.
 */
public class BattingStats {
    public static void main(String[] args) {
        System.out.println("Batting Stats generator");
        enterBatStats();
    }

    public static void enterBatStats() {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        Batter batter = new Batter();
        System.out.println("Please enter the player's name: ");
        batter.playerName = scan.nextLine();

        batter.timesAtBat = validator.getInt("Please enter the number of at-bats: ");

        batter.arrayOfAtBats = new int[batter.timesAtBat];

        for (int i = 0; i < batter.arrayOfAtBats.length; i++) {
            batter.arrayOfAtBats[i] = validator.getIntWithinRange("How many bases attained: ", 0, 4);

            if (batter.arrayOfAtBats[i] > 0) {
                batter.numberHitsOneBase++;
            }

            batter.totalBases += batter.arrayOfAtBats[i];
        }

        System.out.println(batter.playerName + " has a batting average of " + batter.getBattingAverage() + " and a slugging percentage of " + batter.getSluggingPercentage() + ".");
        if (validator.playerAgain() == true) {
            enterBatStats();
        }


    }


}
