package Module2.OOPforms;

interface ABCD{
    void abcd();
}
public class Form3 {
    void useABCD(int a, int b, ABCD obj){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        new Form3().useABCD(4,5,()->{});
    }
}
