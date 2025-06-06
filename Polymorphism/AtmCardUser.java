package Module2.Polymorphism;

class Person1{
    int id;
    String name;
    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class AtmCardUser extends Person1{
    double amount;
    AtmCardUser (double amount, int id , String name){
        super(id,name);
        this.amount = amount;
    }

    void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(amount);
    }
    public static void main(String[] args) {
        AtmCardUser user1 = new AtmCardUser(200000, 1, "Tawan");
        user1.show();
        System.out.println();
        AtmCardUser user2 = new AtmCardUser(500000, 2, "Soe");
        user2.show();
    }
}
