import java.util.Random;

public class Formula {
    public static short[][] Exercise = new short[50][3];
    public static void produce(){    /*产生算式*/
        Random random = new Random();
        int i = 0;   /*算式计数*/
        int add=0,sub=0; /*加减分开计数*/
        while(i<50){
            Exercise[i][0] = (short)random.nextInt(101);
            Exercise[i][1] = (short)random.nextInt(2);
            Exercise[i][2] = (short)random.nextInt(101);

            if((Exercise[i][1]==1&&add==25) || (Exercise[i][1]==0&&sub==25))   /*控制加减的数量*/
                continue;
            if((Exercise[i][1]==1 && Exercise[i][0]+Exercise[i][2]>100) || (Exercise[i][1]==0 && Exercise[i][0]-Exercise[i][2]<0))   /*控制结果0-100*/
                continue;
            for(int t=0;t<i;t++){   /*筛选重复的算式*/
                if(Exercise[t][0]==Exercise[i][1]&&Exercise[t][2]==Exercise[i][1]&&Exercise[t][1]==Exercise[i][1]){
                    i--;
                }
            }
            i++;
        }
    }
    public static void printForm(){  /*打印算式*/
        String str[] = new String[]{"-","+"};
        System.out.println("------------------");
        System.out.println("请计算以下算式：");
        System.out.println("------------------");
        for(int j = 1; j<=50; j++){
            System.out.printf("(%2d)%3d %s%3d =",j,Exercise[j-1][0],str[Exercise[j-1][1]],Exercise[j-1][2]);
            if(j%5!=0) System.out.print("   "); /*一行5个算式*/
            else System.out.println();
        }
    }
    public static void printAnswer(){   /*打印答案*/
        System.out.println("------------------");
        System.out.println("习题答案：");
        System.out.println("------------------");
        for(int j = 1; j<=50; j++){
            System.out.printf("(%2d)",j);
            if(Exercise[j-1][1]==0)
                System.out.printf("%3d",(Exercise[j-1][0]-Exercise[j-1][2]));
            else
                System.out.printf("%3d",(Exercise[j-1][0]+Exercise[j-1][2]));
            if(j%5!=0) System.out.print("   "); //一行5个答案
            else System.out.println();
        }
    }

    public static void main(String[] args) {
        produce();
        printForm();
        printAnswer();
    }
}
