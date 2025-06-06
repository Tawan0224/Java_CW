package Module2.Regex;

import java.util.Scanner;

public class RegexExample2 {
    private static final String VALID_IDENTIFIER_PATTERN = "[0-9]{2}";//exactly 2 times
    //[0-9]{2,} at least 2 times  [0-9]{2,4} 2-4 times
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
