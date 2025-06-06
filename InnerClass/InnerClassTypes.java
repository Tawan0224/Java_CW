package Module2.InnerClass;

class MainClass{
    private static int number = 3;

    //Member Inner Class
    class Inner{
        void display(){
            System.out.println(number+1);
        }
    }

    //Local inner class
    void Local(){
        class LocalInnerClass {
            void display(){
                System.out.println(number+2);
            }
        }
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }

    //Static Nested Class
    static class StaticNestedClass{
        void display(){
            System.out.println(number+3);
        }
    }

    public static void main(String[] args) {
        MainClass obj1 = new MainClass();
        Inner inner = obj1.new Inner();
        //or Inner inner = new A().new Inner();
        inner.display();

        MainClass obj2 = new MainClass();
        obj2.Local();

        StaticNestedClass obj3 = new StaticNestedClass();
        obj3.display();
    }
}
public class InnerClassTypes {

}
