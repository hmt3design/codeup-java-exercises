/**
 * Created by Harry on 1/4/17.
 */
public class ControlLoops {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int count = 0;
        do {
            System.out.println(count);
            count+=2;
        } while (count <=100);

        int backCount = 100;
        do {
            System.out.println(backCount);
            backCount-=5;
        } while (backCount >= -10);

        int j = 2;
        int square = (int)Math.pow(j,2);
        System.out.println(j);
        do {
            System.out.println(square);
            square = (int)Math.pow(square,2);
        } while (square < 1000000);

        for(int k=100; k>=-10; k-=5){
            System.out.println(k);
        }

        for(int m=0; m<=100; m+=2){
            System.out.println(m);
        }
    }

}
