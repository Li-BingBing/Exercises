public class Main {
    public static void main(String[] args) {
        FormExercise exer = new FormExercise();
        Sout sout = new Sout();
        for (int i = 0; i < 3; i++){
            short[][] Exercise = exer.productExer(i, 50);
            sout.printExer(Exercise);
            sout.printAnswer(Exercise);
        }

    }
}
