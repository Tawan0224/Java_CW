package Module2.Polymorphism;
class Ridding{
    String name = "Pearl";
    void parents(){
        System.out.println("Thanakha");
    }
}
public class MethodOverriding3 extends Ridding{
    String name = "Daewi";

    @Override
    void parents() {
        super.parents();
        System.out.println("Cosmetic");
    }
    String name(){
        return super.name;
    }

    public static void main(String[] args) {
        MethodOverriding3 methodOverriding3 = new MethodOverriding3();
        methodOverriding3.parents();

        System.out.println(methodOverriding3.name()+" " +methodOverriding3.name);
    }
}
