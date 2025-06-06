package Module2.Abstraction;

abstract class abs{
    abstract void sum();
    abstract void sum(int a);
}

public class AbstractionEx extends abs{
    @Override
    void sum() {
        System.out.println("abstraction");
    }

    @Override
    void sum(int a) {
    }

    public static void main(String[] args) {
        new AbstractionEx().sum();
    }
}
