package Module2.Inheritance1;

class Shop{
    String location,source;

    public Shop(String location, String source) {
        this.location = location;
        this.source = source;
    }
}
public class User {
    String sneaker;
    int size;
    Shop shop;

    public User(String sneaker, int size, Shop shop) {
        this.sneaker = sneaker;
        this.size = size;
        this.shop = shop;
    }
    void show(){
        System.out.println("Sneaker name: "+ sneaker + "\nSizing " + size + " from "+ shop.location+ " "+ shop.source+ " source");
    }

    public static void main(String[] args) {
        Shop shop1 = new Shop("Lanmadaw", "China");
        User user1 = new User("Mocha", 44, shop1);
        user1.show();

        System.out.println();
        User user2 = new User("Deep Purple", 42, new Shop("Yangon", "Vietnam"));
        user2.show();
    }
}
