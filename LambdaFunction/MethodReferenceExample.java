package Module2.LambdaFunction;

public class MethodReferenceExample {
    static void doIt(){
        System.out.println("do it");
    }

    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                doIt();
            }
        };
        Runnable obj1 = MethodReferenceExample::doIt;
        obj1.run();
    }
}
