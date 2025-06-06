package Module2.Regex;

import java.util.Scanner;

public class RegexExample {
    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][0-9_$]*";
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str, reply;
        while(true){
            System.out.println("Identifier: ");
            str = reader.nextLine();
            if (str.equals("Stop"))
                break;
            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = "Valid";
            } else {
                reply = "Invalid";
            }
            System.out.println(str + ": " + reply + "\n");
        }
    }
}
