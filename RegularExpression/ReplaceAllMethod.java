package Module2.Regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String original = "Aeroplane";
        String modified;
        modified = original.toLowerCase().replaceAll("[aeiou]","*");
        System.out.println(modified);

        String str1 = "This is OOP";
        str1 = str1.replaceAll("OOP","object-oriented programming");
        System.out.println(str1);

        String str2 = "124-25-5647";
        str2 = str2.replaceAll("[0-9]{3}-[0-9]{2}-[0-9]{4}","***-**-****");
        System.out.println(str2);

        String str3 = "Attempt and temp";
        str3 = str3.replaceAll("\\btemp\\b", "temperature");
        System.out.println(str3);
    }
}
