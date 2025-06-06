package Module2.Exception;

public class ArrayIndexOutOfBoundExceptionEx {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8};
        numbers[8] = 9;
        System.out.println(numbers[8]);
    }
}
