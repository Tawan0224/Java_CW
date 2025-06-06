package Module2.Exception;

public class NullPointerExceptionEx {
    public static void main(String[] args) {
        String str = null;
        int count = str.length();
        System.out.println(count);
    }
}
