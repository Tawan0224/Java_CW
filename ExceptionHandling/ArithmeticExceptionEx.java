package Module2.Exception;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

