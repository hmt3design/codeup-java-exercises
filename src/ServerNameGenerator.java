import java.util.Arrays;

/**
 * Created by Harry on 1/11/17.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {

        System.out.println("Server Name Generator");

        //arrays of words
        int max = 9;
        int min = 0;
        String[] adjectives = {"great", "little", "own", "other", "old", "right", "big", "high", "small", "large"};
        String[] nouns = {"people", "history", "art", "literature", "science", "politiicans", "island", "castle", "lightsaber", "dragon"};

        int range = (max - min) + 1;
        int rangeStore1 = (int) (Math.random() * range);
        int rangeStore2 = (int) (Math.random() * range);
//        System.out.println(rangeStore1);
//        System.out.println(rangeStore2);

        String arrayAdjective = adjectives[rangeStore1];
        String arrayNoun = nouns[rangeStore2];


        System.out.println("Your random phrase is: " + arrayAdjective + " " + arrayNoun);

    }
}
