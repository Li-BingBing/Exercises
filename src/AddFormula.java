/**
 * 加法子类
 */
public class AddFormula extends Formula {
    public static final int UPPER= 101;
    public boolean check(short[] num){
        if (num[0] + num[2] < UPPER)
            return true;
        return false;
    }
}
