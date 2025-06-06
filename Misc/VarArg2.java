package Module2.Misc;

public class VarArg2 {
    static void specificName(String ... names){
        String a = "";
        for (String name : names) {
            a +=name;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        specificName("Soe ", "Min ", "Min ","Latt");
    }
}
