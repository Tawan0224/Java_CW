package Module2.Multithreading;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + ": " + ThreadExample.currentThread().getName());
            try {
                ThreadExample.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample obj = new ThreadExample();
        ThreadExample obj1 = new ThreadExample();

        obj.setName("Tawan");
        obj1.setName("Soe");
        obj.start();
        obj1.start();
//        obj.run();
//        obj1.run();
    }
}
