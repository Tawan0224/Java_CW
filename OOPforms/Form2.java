package Module2.OOPforms;

class CD{
    void mCD(){
        System.out.println("CD");
    }
}
public class Form2 {
    void mEF(CD obj){
        obj.mCD();
    }

    public static void main(String[] args) {
        new Form2().mEF(new CD());
    }
}
