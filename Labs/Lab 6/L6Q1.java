import java.util.Scanner;

public class L6Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out
                .println("How many marks would you like to enter into the system?");
        double[] marks = new double[s.nextInt()];
        double[] out_of = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("What did you get?");
            marks[i] = s.nextDouble();
            System.out.println("Out of what?");
            out_of[i] = s.nextDouble();
        }
        System.out.printf("Your mark is: %.1f%%", computeGrade(marks, out_of));
        s.close();

    }

    public static double computeGrade(double[] marks, double[] out_of) {
        double avg = 0.0;
        for (int i = 0; i < marks.length; i++) {
            avg += (marks[i] / out_of[i]);
        }
        return (avg /marks.length)*100;
    }

}
