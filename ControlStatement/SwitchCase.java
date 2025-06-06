package Module2.ControlStatement;

public class SwitchCase {
    public static void main(String[] args) {
        String day="monday";
        switch (day){
            case "monday":
                System.out.println(day + " is weekday.");
                break;
            case "tuesday":
                System.out.println(day+ " is weekday.");
                break;
            case "wedneday":
                System.out.println(day+ " is weekday.");
                break;
            case "thursday":
                System.out.println(day+ " is weekday.");
                break;
            case "friday":
                System.out.println(day+ " is weekday.");
                break;
            default:
                System.out.println("weekend");
        }
    }
}
