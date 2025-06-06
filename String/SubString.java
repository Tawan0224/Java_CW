package Module2.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        String word = "Soe Min Min Latt";
        String result1 = word.substring(0);
        String result2 = word.substring(0,3);
        String result3 = word.substring(4, 11);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        String message = "Hello,World";
        String sentence[] = message.split("\\,");
        System.out.println(Arrays.toString(sentence));
    }
}
