package AlligatorsSheep;

/*** Created by Harry on 1/20/17.*/

public class CountTestApp {

    public static void main(String[] args) {
        System.out.println("Counting alligators...\n");

        int count = 3;
        CountUtil countUtil = new CountUtil();
        Alligator alligator = new Alligator();
        countUtil.count(alligator, count);

        System.out.println("Counting sheep...\n");
        int sheepCount = 2;
        Sheep sheep = new Sheep();
        countUtil.count(sheep, sheepCount);


    }
}