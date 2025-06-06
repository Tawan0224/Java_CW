package Module2.LambdaFunction;

interface Callback{
    void doit(int a, int b);
}
public class CallbackFunction {
    static void diplay(int number){
        System.out.println(number);
    }
    static int add(int a, int b){
        int result = a + b;
        return result;
    }
    static void add2(int a, int b){
        int result1 = a + b;
        diplay(result1);
    }

    public static void main(String[] args) {
        int result = add(5,6);
        diplay(result);

        add2(3,7);
    }
}

class run{
    static void result(int a, int b, Callback obj){
        obj.doit(a,b);
    }
    public static void main(String[] args) {
        result(5,6,(a, b) -> {
            System.out.println(a+b);
        });
        result(3,5,(a, b) -> {
            System.out.println(a*b);
        });
    }
}
