package Module2.Polymorphism;
//overriding
class Parent7{
    void add(){
        System.out.println("Parent method");
    }
    void cal(){
        System.out.println("Cal");
    }
}
public class DifferentBetween extends Parent7{
    //overloading
    static void sum(int a){
        System.out.println(a+a);
    }
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void sum(double a){
        System.out.println(a+a);
    }

    @Override
    void add() {
        System.out.println("Child Method");
    }
    public static void main(String[] args) {
        sum(3);
        sum(3.4);
        sum(1,5);

        DifferentBetween obj = new DifferentBetween();
        obj.add();
        obj.cal();
    }


}
