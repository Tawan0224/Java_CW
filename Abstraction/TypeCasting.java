package Module2.Abstraction;

class Parent{}
class Child extends Parent{}

public class TypeCasting {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
        double b = a;
        System.out.println(b);
        int c = (int) b;
        System.out.println(c);

        Child child = new Child(); //Up Casting
        Parent child1 = new Child(); //Up Casting
        Child child2 = (Child) new Parent(); //Down Casting
    }
}
