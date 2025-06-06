package Module2.Exception;

public class MultiCatchBlockExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
//            int result = a / b;
//            System.out.println(result);
            String x = null;
            System.out.println(x.length());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exceptiion");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds Exception");
        }catch(Exception e){
            System.out.println("General Ecsption");
        }
        System.out.println("The End");

    }
}
