package Module2.Arrays;

public class SmallestNum {
    public static void main(String[] args) {
        int num[]= {9,3,6,8,2,5,9,3,34};
        int smallest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest)
                smallest = num[i];
        }
        System.out.println(smallest);
    }
}
