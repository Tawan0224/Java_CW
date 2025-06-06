package Module2.Exception;

import java.util.Scanner;

public class ThrowKeyword {
    static void check(int number){
        if (number >= 5){
            throw new ArithmeticException("number must be under 5");
        }else {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = reader.nextInt();
        try{
            check(num);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
