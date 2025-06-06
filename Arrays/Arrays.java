package Module2.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6,};
        String names[]= new String[] {"AA","BB","CC","DD","EE"};
        System.out.println(num[2]);
        System.out.println();

        num[2]=20;
        System.out.println(num[2]);
        System.out.println(names[3]);
        System.out.println();

        //for i loop
        for(int i = 0; i<names.length; i++) {
            System.out.print(names[i] + "\t");
        }
        System.out.println();
        System.out.println();

        //for each loop
        for(String n : names){
            System.out.print(n+"\t");
        }
        System.out.println();
        System.out.println();

        //for r loop(reverse)
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+"\t");
        }
    }
}
