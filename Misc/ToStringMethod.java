package Module2.Misc;

public class ToStringMethod {
    static class Tawan{
        @Override
        public String toString() {
            return "Tawan";
        }
    }

    @Override
    public String toString() {
        return "Hello";
    }

    public void main(String[] args) {
        System.out.println(new Tawan());
        System.out.println(new ToStringMethod());
    }
}
