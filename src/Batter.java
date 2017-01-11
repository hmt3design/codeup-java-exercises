/**
 * Created by Harry on 1/11/17.
 */
class Batter {
    String playerName;
    int timesAtBat;
    int[] arrayOfAtBats;
    int numberHitsOneBase;
    int totalBases;
    double battingAverage;
    double sluggingPercentage;

    public double getBattingAverage() {
        battingAverage = (double) numberHitsOneBase / arrayOfAtBats.length;
        return battingAverage;
    }

    public double getSluggingPercentage() {
        sluggingPercentage = (double) totalBases / arrayOfAtBats.length;
        return sluggingPercentage;
    }


}
