package Module2.Abstraction;

abstract class Food{
    abstract void Region();
}

class Thai extends Food{
    @Override
    void Region() {
        System.out.println("I eat Thai food");
    }
}

class Burmese extends Food{
    @Override
    void Region() {
        System.out.println("I eat Burmese food");
    }
}

public class AbstractionEx2 {
    public static void main(String[] args) {
        Thai obj = new Thai();
        obj.Region();

        Burmese obj2 = new Burmese();
        obj2.Region();
    }
}
