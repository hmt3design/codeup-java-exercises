package AlligatorsSheep;

/*** Created by Harry on 1/20/17.*/

public class CountUtil {
    public void count(Countable c, int maxCount) {
        for (int i = 0; i < maxCount; i++) {
            c.incrementCount();
            System.out.println(c.getCountString());
        }
        //call resetCount method
        c.resetCount();
    }
}