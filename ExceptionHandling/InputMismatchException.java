package Module2.Exception;
import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = reader.nextInt();
        System.out.println(num);
    }
}
