package Module2.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
        int other[] = new int[6];
        System.arraycopy(num, 0, other, 0, 6);
        for (int i = 0; i < other.length; i++) {
            System.out.print(other[i] + " ");
        }
        System.out.println();
        int another []= other.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.print(another[i] + " ");
        }
    }
}
