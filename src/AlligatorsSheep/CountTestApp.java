package AlligatorsSheep;

/*** Created by Harry on 1/20/17.*/

public class CountTestApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Counting alligators...\n");

        CountUtil countUtil = new CountUtil();
        Alligator alligator = new Alligator();
        countUtil.count(alligator, 3);

        System.out.println("Counting sheep...\n");
        Sheep blackie = new Sheep("Blackie");
        countUtil.count(blackie, 2);

        Sheep dolly = (Sheep) blackie.clone();
        dolly.setName("Dolly");
        countUtil.count(dolly, 3);
        countUtil.count(blackie,1);

    }
}