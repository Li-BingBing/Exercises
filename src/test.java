public class test {
    public static void main(String[] args) {
        FormExercise exer = new FormExercise();
        short[][] Exercise = exer.productExer(50);
        Sout sout = new Sout();
        sout.printExer(Exercise);
        sout.printAnswer(Exercise);
    }
}
