package Module2.LambdaFunction;

interface eatable{
    void eat();
}
public class LambdaExample1{
    public static void main(String[] args) {
        eatable eat = new eatable() {
            @Override
            public void eat() {
                System.out.println("I eat cake.");
            }
        };
        eat.eat();

        //Lambda function
        eatable eat2 = () -> {
            System.out.println("I eat cake cake.");
        };
        eat2.eat();

        //Anonymous Lambda Function
        ((eatable) () -> System.out.println("I eat cake cake cake.")).eat();
    }
}
