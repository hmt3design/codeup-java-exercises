package AlligatorsSheep;

/*** Created by Harry on 1/20/17.*/

public class Sheep implements Countable, Cloneable {
    private int count = 0;
    private String setSheepName;

    public Sheep(String setSheepName) {
        this.setSheepName = setSheepName;
    }

    public Sheep() {
        this.count = 0;
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 0;
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
//        if (!(this instanceof Cloneable)) {
//            throw new CloneNotSupportedException();
//        }
        return super.clone();
    }

}
