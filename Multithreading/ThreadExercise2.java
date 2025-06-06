package Module2.Multithreading;

class Thread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running in the Thread3 runnable interface.");
    }
}

class Thread4 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread4 is running");
    }
}

public class ThreadExercise2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running in the Runnable interface.");
    }

    public static void main(String[] args) {
        ThreadExercise2 obj = new ThreadExercise2();
        Thread thread = new Thread(obj);
        thread.start();

        Thread3 obj2 = new Thread3();
        Thread thread1 = new Thread(obj2);
        thread1.start();

        Thread4 thread4 = new Thread4();
        Thread thread2 = new Thread(thread4, "tawan");
        thread2.start();
    }
}
