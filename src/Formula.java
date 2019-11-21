import java.util.Random;

/**
 * 产生算式
 */
public class Formula {
    public short[] Product() {
        short[] Exercise = new short[3];
        Random random = new Random();
        Exercise[0] = (short) random.nextInt(101);
        Exercise[1] = (short) random.nextInt(2);
        Exercise[2] = (short) random.nextInt(101);
        return Exercise;
    }
}
