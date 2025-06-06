package Module2.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,3,4,7,8,9,9};
        for (int i = 0; i<num.length; i++){
            for (int j = i+1; j<num.length; j++){
                if (num[i]==num[j]){
                    System.out.println(num[j]);
                }
            }
        }
    }
}
