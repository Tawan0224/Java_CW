package Module2.Inheritance1;

public class AggregationEx {
    String name;
    int age;
    Location location;
    public AggregationEx(String name, int age, Location location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    void show(){
        System.out.println("Name is "+ name + "\nAge "+ age + "\nLive in "+ location.city+ ", "+ location.state+ ",  "+ location.country);
    }
    public static void main(String[] args) {
        Location location1 = new Location("Yangon", "Yangon","Myanmar");
        AggregationEx student1 = new AggregationEx("Tawan", 21, location1);
        student1.show();
    }
}
