package AlligatorsSheep;

/*** Created by Harry on 1/20/17.*/

public class CountUtil {
    public void count(Countable e, int maxCount) {
        //call resetCount method
        e.resetCount();

        while (e.getCount() <= maxCount) {
            System.out.println(e.getCountString());
            e.incrementCount();
        }
        System.out.println("\n");
    }

}