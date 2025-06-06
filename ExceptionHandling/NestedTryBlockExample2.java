package Module2.Exception;

public class NestedTryBlockExample2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        try{
            try{
                try{
                    int result = a/b;
                    System.out.println(result);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException");
                }
            }catch (NullPointerException e){
                System.out.println("NullPointerException");
            }
        }catch (Exception e){
            System.out.println("General Exception");
        }
    }
}
