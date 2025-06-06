package Module2.Misc;

public class VarArg {
    static void show(Integer... numbers){ //Variable Argument
        int a = 0;
        for (Integer number: numbers) {
            a += number;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        show(2,4,564,75,24,67,24);
    }
}
