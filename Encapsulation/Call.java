package Module2.Encapsulation;

public class Call {
    public static void main(String[] args) {
        Model obj = new Model("Soe", 24, 21);
        obj.setName("Tawan");
        obj.setId(2);
        obj.setAge(21);
        System.out.println("Name: " +obj.getName());
        System.out.println("Id: " +obj.getId());
        System.out.println("Age: " +obj.getAge());

        System.out.println();
        System.out.println("Name: "+ obj.getName2());
        System.out.println("ID: "+ obj.getId2());
        System.out.println("Age: "+ obj.getAge2());
    }
}
