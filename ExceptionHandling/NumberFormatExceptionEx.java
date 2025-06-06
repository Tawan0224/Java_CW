package Module2.Exception;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        String str = "abc";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
