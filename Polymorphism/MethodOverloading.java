package Module2.Polymorphism;

//method overloading
public class MethodOverloading {
    static void calculate(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void calculate(int number){
        System.out.println(number+number);
    }
    public static void main(String[] args) {
        calculate(3,5);
        calculate(5);
    }
}
