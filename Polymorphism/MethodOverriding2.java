package Module2.Polymorphism;

class Over2{
    Over2(String name){
        System.out.println(name);
    }
}
public class MethodOverriding2 extends Over2{
    MethodOverriding2(){
        super("Tawan");
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        MethodOverriding2 methodOverriding2 = new MethodOverriding2();
    }
}
