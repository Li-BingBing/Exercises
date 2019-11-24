import java.util.HashSet;
import java.util.Random;

/**
 * 产生算式习题
 */
public class FormExercise {

    public short[][] productExer(int select, int number) {
        int[] count = {0, 0};/*count[0]对加法算式进行计数,count[1]对减法算式进行计数,
                                                                           与产生的符号代表对应*/
        int flog = 0;
        short[][] exercise = new short[number][3];
        short[] Form = new short[3];
        HashSet<short[]> Temp = new HashSet<short[]>();
        AddFormula addForm = new AddFormula();
        SubFormula subForm = new SubFormula();
        Random random = new Random();
        Temp.clear();
        /*
        产生加法算式
         */
        if (select == 0) {
            while (Temp.size() < number) {
                Form = addForm.Product();
                Form[1] = 0;
                if (addForm.check(Form) && !Temp.contains(Form)) {
                    Temp.add(Form);
                }
            }
        }
        /*
        产生减法算式
         */
        if (select == 1) {
            while (Temp.size() < number) {
                Form = subForm.Product();
                Form[1] = 1;
                if (subForm.check(Form) && !Temp.contains(Form)) {

                    Temp.add(Form);
                }
            }
        }
        /*
        产生混合算式
         */
        else {
            while (Temp.size() < number) {
                int t = random.nextInt(2);
//                System.out.println(t);
                if (t == 0) {
                    Form = addForm.Product();
                    Form[1] = 0;
                    /*
                如果算式结果符合0-100  && 加法计算小于总算式的一半 && set里没有这个算式
                把算式入栈，并进行计数
                    */
                    if (addForm.check(Form) && count[0] <= (number / 2) && !Temp.contains(Form)) {
                        Temp.add(Form);
                        count[0]++;
                    }
                }
                else{
                    Form = subForm.Product();
                    Form[1] = 1;
                    /*
                如果算式结果符合0-100  && 加法计算小于总算式的一半 && set里没有这个算式
                把算式入栈，并进行计数
                    */
                    if (subForm.check(Form) && count[1] <= (number / 2) && !Temp.contains(Form)) {
                        Temp.add(Form);
                        count[1]++;
                    }
                }

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
