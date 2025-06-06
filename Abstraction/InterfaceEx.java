package Module2.Abstraction;

interface callable{
    void sum();
    void sum2();
    void sum3();
}

interface B{
    void cal();
}

public class InterfaceEx implements callable, B{
    @Override
    public void sum() {
    }
    @Override
    public void sum2() {
    }
    @Override
    public void sum3() {
    }
    @Override
    public void cal(){
    }
    public static void main(String[] args) {
        InterfaceEx obj = new InterfaceEx();
        obj.sum();
    }
}
