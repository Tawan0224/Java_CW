package Module2.LambdaFunction;

interface Writable{
    void write(String message);
}
interface Calulator{
    void calculate(int a, int b);
}
public class LambdaExample2 {
    public static void main(String[] args) {

        //Lambda
        Writable writable = message -> {
            System.out.println(message);
        };
        writable.write("Writing message");

        //Anonymous Lambda
       ((Writable)message -> {}).write("message");

        Calulator calculate = (a, b) -> {
            System.out.println(a+b);
        };
        calculate.calculate(3,4);
    }

}
