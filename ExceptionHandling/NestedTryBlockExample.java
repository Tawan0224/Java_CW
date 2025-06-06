package Module2.Exception;

public class NestedTryBlockExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            try {
                int result = a / b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exceptiion");
            }
            try {
                int numbers[] = new int[9];
                System.out.println(numbers[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds Exception");
            }
            System.out.println("HAHA");
        }catch (Exception e){
            System.out.println("General Exception");
        }
        System.out.println("The End");

    }
}
