package Module2.Misc;

public class CustomWrapperClass {
    int number;
    CustomWrapperClass(int a ){
        number = a;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        CustomWrapperClass obj = new CustomWrapperClass(21);
        System.out.println(obj);
    }
}
