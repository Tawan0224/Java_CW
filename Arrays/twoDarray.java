package Module2.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int num[][] = new int [3][3];
        int dnum[][] = {
                {1,2,3},
                {3,2,1},
                {2,3,1}
        };
        //System.out.println(dnum[1][1]);

        for(int row = 0; row < dnum.length; row++){
            for(int col = 0; col < dnum[row].length; col++){
                System.out.print(dnum[row][col]);
            }
            System.out.println();
        }
    }
}
