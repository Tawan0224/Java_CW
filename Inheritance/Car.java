package Module2.Inheritance1;

class Engine{
    void run(){
        System.out.println("Engine is started");
    }
}
public class Car {
    Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    void start(){
        engine.run();
    }

    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Car car = new Car(engine1);
        car.start();
    }
}
