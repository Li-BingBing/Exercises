import java.util.HashSet;

/**
 * 产生算式习题
 */
public class FormExercise {

    public short[][] productExer(int number) {
        int[] count = {0, 0};/*count[0]对加法算式进行计数,count[1]对减法算式进行计数,
                                                                           与产生的符号代表对应*/
        int flog = 0;
        short[][] exercise = new short[number][3];
        short[] Form = new short[3];
        HashSet<short[]> Temp = new HashSet<short[]>();
        Formula form = new Formula();
        Check ck = new Check();
        Temp.clear();

        while (Temp.size() < number) {
            Form = form.Product();
            flog = Temp.size();
            /*
            如果算式结果符合0-100  && 加法计算小于总算式的一半 && set里没有这个算式
            把算式入栈，并进行计数
             */
            if (ck.check(Form) && count[Form[1]] <= (number / 2) && !Temp.contains(Form)) {
                    Temp.add(Form);
                    count[Form[1]]++;
            }
        }
        /*
        把栈里的算式存到一个数组里
         */
        flog = 0;
        for (short[] s : Temp) {
            exercise[flog++] = s;
        }
        return exercise;
    }
}
