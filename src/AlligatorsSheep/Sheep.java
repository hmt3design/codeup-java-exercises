package AlligatorsSheep;

/*** Created by Harry on 1/20/17.*/

public class Sheep implements Countable, Cloneable {
    private int count;
    private String setSheepName;

    public Sheep() {
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
        return (count + " " + setSheepName);
    }

    public void setName(String name) {
        this.setSheepName = name;
    }

    public String getName() {
        return setSheepName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
