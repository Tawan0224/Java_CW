package Module2.Polymorphism;

class TestInstance{

}
public class InstanceOf extends TestInstance{
    public static void main(String[] args) {
        InstanceOf obj = new InstanceOf();
        InstanceOf obj1 = null;
        System.out.println(obj instanceof InstanceOf);
        System.out.println(obj instanceof TestInstance);

        System.out.println(obj1 instanceof InstanceOf);
    }
}
