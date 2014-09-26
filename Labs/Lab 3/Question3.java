import java.util.Scanner;


public class Question3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 2 digit integer.");
        System.out.printf("The reverse of that integer is: %d", flip(s.nextInt()));
        s.close();
    }
    
    static int flip(int i) {
        return ((i%10)*10)+(i/10);
    }

}
