package Module2.Abstraction;
interface Ex{
    void A1();
    void A2();
}
public class InterfaceWithoutImplements {
    public static void main(String[] args) {
        new Ex() {
            @Override
            public void A1() {
                System.out.println("Working");
            }
            @Override
            public void A2() {
            }
        }.A1();
    }
}
