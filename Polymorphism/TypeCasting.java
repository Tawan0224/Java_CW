package Module2.Polymorphism;

class Type{
    int a = 5;
    void sum(){
        System.out.println("Parent");
    }
}
public class TypeCasting extends Type {
    int a = 7;

    @Override
    void sum(){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        int a = 5;
        double b = a; //widening casting
        int c = (int) b; //narrowing casting
        Type type = new TypeCasting(); //widening casting
        type.sum();
        System.out.println(type.a);

        TypeCasting child = (TypeCasting) new Type(); //down casting

    }
}
