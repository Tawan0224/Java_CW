package Module2.Exception;

public class CustomException extends Exception{
    CustomException(String str){
        super(str);
    }
}
class TestCustomException{
    public static void main(String[] args) {
        try {
            throw new CustomException("this is custom exception");
        } catch (CustomException e) {
//            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
