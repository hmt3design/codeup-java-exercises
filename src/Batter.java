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
        battingAverage = battingAverage*1000;
        battingAverage = (int) battingAverage;
        battingAverage = battingAverage/1000;
        return battingAverage;
    }

    public double getSluggingPercentage() {
        sluggingPercentage = (double) totalBases / arrayOfAtBats.length;
        sluggingPercentage = sluggingPercentage*1000;
        sluggingPercentage = (int) sluggingPercentage;
        sluggingPercentage = sluggingPercentage/1000;
        return sluggingPercentage;
    }


}
