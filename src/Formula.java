import java.util.Random;

/**
 * 产生算式
 */
public abstract class Formula {
    private final int LIMIT = 101;
    public abstract boolean check(short[] num);
    public short[] Product() {
        short[] Exercise = new short[3];
        Random random = new Random();
        Exercise[0] = (short) random.nextInt(LIMIT);
        Exercise[2] = (short) random.nextInt(LIMIT);
        return Exercise;
    }
}
