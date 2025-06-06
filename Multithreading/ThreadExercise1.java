package Module2.Multithreading;

public class ThreadExercise1 extends Thread{
    @Override
    public void run() {
        System.out.println("Run is running.");
    }
    public static void main(String[] args) {
        ThreadExercise1 obj = new ThreadExercise1();
        obj.start();

        Thread thread = new Thread("Tawan");
        System.out.println(thread.getName());
    }
}
