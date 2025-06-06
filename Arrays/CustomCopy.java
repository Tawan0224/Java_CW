package Module2.Arrays;

public class CustomCopy {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8};
        int copy[]=new int[ar.length];
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            copy[i]=ar[i];
            System.out.print(copy[i]+"\t");
        }
    }

}
