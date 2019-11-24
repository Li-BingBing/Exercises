/**
 * 这是筛选产生的算式是否符合要求
 */
public class Check {
    private final int UPPER = 100;
    private final int LOWER = 0;

    public boolean check(short[] num) {
        if (num[1] == 0 && num[0] + num[2] <= UPPER)
            return true;
        else if (num[1] == 1 && num[0] - num[2] >= LOWER)
            return true;
        else
            return false;

    }
}
