package Module2.Inheritance1;

class Parents1{
    void parents(){
        System.out.println("This is parents");
    }
}
public class Inheritance1 extends Parents1 {
    void child(){
        System.out.println("This is child");
    }
    public static void main(String[] args) {
        Inheritance1 inheritance1 = new Inheritance1();
        inheritance1.child();

        Parents1 parents1 = new Parents1();
        parents1.parents();
    }
}
