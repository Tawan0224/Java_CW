package Module2.String;

public class StringExample {
    public static void main(String[] args) {
        //String Constant Pool
        char ch[] = {'h','e','l','l','o'};
        String string = new String(ch);
        System.out.println(string);

        //String Compare
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}
