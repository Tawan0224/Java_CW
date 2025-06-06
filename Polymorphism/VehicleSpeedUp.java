package Module2.Polymorphism;

class Vehicle{
    int speed;
    void speedUp(){
        speed +=10;
    }
    int getSpeed(){
        return speed;
    }
}

class Car extends Vehicle{
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Car increases speed");
    }
}

class Bicycle extends Vehicle{
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Bicycle decreases speed");
    }
}

public class VehicleSpeedUp {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        System.out.println("Car Initial Speed: "+ car.speed);
        System.out.println("Bicycle Initial Speed: "+ bicycle.speed);
        car.speedUp();
        bicycle.speedUp();
        System.out.println(car.getSpeed());
        System.out.println(bicycle.getSpeed());
    }
}
