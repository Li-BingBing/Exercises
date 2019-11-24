/**
 * 打印算数式，以及答案
 */
public class Sout {
    /*
    打印算式，一行五个式子
     */
    public void printExer(short[][] Exercise) {
        String str[] = new String[]{"+", "-"};
        System.out.println("------------------");
        System.out.println("请计算以下算式：");
        System.out.println("------------------");
        for (int j = 1; j <= Exercise.length; j++) {
            System.out.printf("(%2d)%3d %s%3d =", j, Exercise[j - 1][0], str[Exercise[j - 1][1]], Exercise[j - 1][2]);
            if (j % 5 != 0) System.out.print("   "); /*一行5个算式*/
            else System.out.println();
        }
        System.out.println();
    }

    /*
    打印答案，一行五个答案
     */
    public void printAnswer(short[][] Exercise) {
        System.out.println("------------------");
        System.out.println("习题答案：");
        System.out.println("------------------");
        for (int j = 1; j <= Exercise.length; j++) {
            System.out.printf("(%2d)", j);
            if (Exercise[j - 1][1] == 0)
                System.out.printf("%3d", (Exercise[j - 1][0] + Exercise[j - 1][2]));
            else
                System.out.printf("%3d", (Exercise[j - 1][0] - Exercise[j - 1][2]));
            if (j % 5 != 0) System.out.print("   "); //一行5个答案
            else System.out.println();
        }
        System.out.println();
    }
}
