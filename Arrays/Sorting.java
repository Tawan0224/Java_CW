package Module2.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int num[]= {25,78,35,67,18,25,98};
        int tem = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++){
                if (num[i]<num[j]) {
                    tem = num[i];
                    num[i] = num[j];
                    num[j] = tem;
                }
            }
        }
        for (int k=0; k < num.length; k++) {
            System.out.print(num[k]+"\t");
        }
    }
}
