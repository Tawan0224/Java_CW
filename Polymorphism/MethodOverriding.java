package Module2.Polymorphism;

class Over{
    void sum(int a){
        System.out.println("Parent class Method "+ a);
    }
}
public class MethodOverriding extends Over{
    void sum(){
        System.out.println("Child class Method");
    }
    void parentMethod(int a){
        super.sum(a);
    }
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.sum();
        obj.parentMethod(5);
    }
}
