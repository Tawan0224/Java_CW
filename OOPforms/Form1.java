package Module2.OOPforms;

class A{
    void mA(){
        System.out.println("mA");
    }
}
public class Form1 {
    void mB(){
        new A().mA();
    }
    public static void main(String[] args) {
        new Form1().mB();
    }
}
