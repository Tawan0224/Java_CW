package Module2.String;

import java.util.StringJoiner;

public class StringConcatenation {
    public static void main(String[] args) {
        String fName = "Soe ";
        String lName = "Min";
        System.out.println(fName.concat(lName));

        StringBuilder str = new StringBuilder("Hello ");
        StringBuilder str1 = new StringBuilder("World");
        StringBuilder fullStr = str.append(str1);
        System.out.println(fullStr);

        String result = String.format("%s%s" , fName,lName);
        System.out.println(result);

        String result1 = String.join("-", str, fName);
        System.out.println(result1);

        StringJoiner result2 = new StringJoiner("_");
        result2.add("My");
        result2.add("name");
        result2.add("is");
        System.out.println(result2);
    }
}
