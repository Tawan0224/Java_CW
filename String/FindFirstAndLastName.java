package Module2.String;

import java.util.Scanner;

public class FindFirstAndLastName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter yout name: ");
        String name = reader.nextLine();
        String word[] = name.split(" ");

        System.out.println("Hello " + word[0] + "\n" + "Mingalar Par " + word[word.length-1]);
        reader.close();
    }
}
