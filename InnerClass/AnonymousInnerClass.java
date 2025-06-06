package Module2.InnerClass;

interface AA{
    void display();
}

abstract class BB {
    abstract void show();
}


class AABB extends BB implements AA {
    @Override
    void show() {
        System.out.println("Showing");
    }
    @Override
    public void display() {
        System.out.println("Displaying");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AABB aabb = new AABB();
        aabb.show();
        aabb.display();
        System.out.println();

        //Anonymous Inner Class
        BB bbb = new BB() {
            @Override
            void show() {
                System.out.println("Showing by Anonymous Inner Class");
            }
        };
        AA aaa = new AA() {
            @Override
            public void display() {
                System.out.println("Displaying by Anonymous Inner Class");
            }
        };
        bbb.show();
        aaa.display();
    }
}
