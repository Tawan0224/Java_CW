package Module2.LambdaFunction;

interface Clickable{
    void click();
}
public class MethodReference {
    static void listener(){}
    static void listener1(Clickable c){
        System.out.println("Listener");
    }
    void listener2(){
        System.out.println("Blah blah blah");
    }
    public static void main(String[] args) {
        listener1(()->{
            System.out.println("ok");
        });
        Clickable clickable = new Clickable() {
            @Override
            public void click() {
                listener();
            }
        };

        Clickable clickable1 = MethodReference::listener;
        clickable1.click();

        Clickable clickable2 = new MethodReference()::listener2;
        clickable2.click();
    }
}
