package AlligatorsSheep;

/*** Created by Harry on 1/20/17.*/

public class Alligator implements Countable {
    private int count;

    public Alligator() {
        this.count = 1;
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 1;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return (count + " alligator");
    }
}