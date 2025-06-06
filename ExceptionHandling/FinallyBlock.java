package Module2.Exception;

public class FinallyBlock {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }finally {
            System.out.println("Everytime");
        }
    }
}
