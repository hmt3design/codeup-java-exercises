import java.util.Scanner;

/**
 * Created by Harry on 1/11/17.
 */
public class BattingStatsInst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        System.out.println("Play ball!");

        Batter batter = new Batter();

        //get the number of times the player is at bat
        batter.timesAtBat = validator.getInt("Enter times at bat: ");

        // create array with as many elements as number of times that the player is at bat
        batter.arrayOfAtBats = new int[batter.timesAtBat];

        //get results for each time the player is at bat
        for (int i=0; i<batter.arrayOfAtBats.length; i++) {
            batter.arrayOfAtBats[i] = validator.getIntWithinRange("How many bases for this time at bat?", 0, 4);

            // count number of times At Bats with at leasat one base
            if (batter.arrayOfAtBats[i] > 0) {
                batter.numberHitsOneBase++;
            }

            // add all atBat results to a totalBases count
            batter.totalBases += batter.arrayOfAtBats[i];
        }

        System.out.println("The batter's batting average is: " + batter.getBattingAverage());
        System.out.println("The batter's slugging percentage is: " + batter.getSluggingPercentage());
    }
}
