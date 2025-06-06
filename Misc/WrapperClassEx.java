package Module2.Misc;

public class WrapperClassEx {
    public static void main(String[] args) {
        int a = 67;

        Integer integer = a; //primitive to wrapper class/obj (autoboxing)
        System.out.println(integer.getClass().getName());
        String str = integer.toString();
        System.out.println(str.length());

        String num = "1235364";
        Integer num1 = Integer.valueOf(num);
        System.out.println(num1);

        int num2 = num1; //obj to primitive (unboxing)
        System.out.println(num2);
    }
}
