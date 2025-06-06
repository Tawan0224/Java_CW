package Module2.Multithreading;

class ABC {
    synchronized void doSomething(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class A extends Thread{
    ABC abc;
    A(ABC obj){
        this.abc = obj;
    }
    @Override
    public void run() {
        abc.doSomething();
        System.out.println("a");
    }
}
class B extends Thread{
    ABC abc;
    B(ABC obj){
        this.abc = obj;
    }
    @Override
    public void run() {
        abc.doSomething();
        System.out.println("b");
    }
}
public class Sync {
    public static void main(String[] args) {
        ABC abc = new ABC();
        A obj = new A(abc);
        B obj1 = new B(abc);
        obj.start();
        obj1.start();
    }
}
