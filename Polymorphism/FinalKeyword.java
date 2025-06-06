package Module2.Polymorphism;

public class FinalKeyword {
    private static final int Hello = 175;
    final int a;

    public FinalKeyword(int number) {
        this.a = number;
    }

    public static void main(String[] args) {
        System.out.println(Hello);

        FinalKeyword finalKeyword = new FinalKeyword(4);
        System.out.println(finalKeyword.a);
    }

}
