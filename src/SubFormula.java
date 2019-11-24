/**
 * 减法子类
 */
public class SubFormula extends Formula {
    public static final int LOWER = 0;
    public boolean check(short[] num) {
        if (num[0] - num[2] >= LOWER)
            return true;
        return false;
    }
}
