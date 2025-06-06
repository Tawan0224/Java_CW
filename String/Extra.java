package Module2.String;

import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        String  word = " Hello World  ";
        System.out.println(word.trim().length());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        if (email.endsWith("@gmail.com")){
            System.out.println("Available");
        } else {
            System.out.println("Unavailable");
        }

        String name = "Tawan";
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('n'));
    }
}
