package Module2.CollectionFramework;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("adfgh");
        list.add(1);
        list.add(true);
        list.add(2.4);
        list.add('a');
        System.out.println(list.size());

        List<String> strList = new ArrayList<>();
        strList.add("AFJ");

        List<Integer> intList = new ArrayList<>();
        intList.add(4);

        //fixed length
        List list1 = Arrays.asList('a', 3, "ASD");
//      list1.add(9);
    }
}
