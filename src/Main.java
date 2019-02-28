import com.solution801d1000.s851d900.Solution888;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution888 running985 = new Solution888();
        //int [][] init={{1,2,3,4},{5,1,2,3},{9,5,1,2}};2^31=-2147483648
        //int[][] a={{10,2,5},{10,9,1},{1,4,3},{1,2,3}};
        int[] ress985= running985.fairCandySwap(new int[]{8, 73, 2, 86, 32},
                new int[]{56, 5, 67, 100, 31});
        System.out.println(Arrays.toString(ress985));
        //System.out.println(ress985.get(1));
        /*for (int i = 0; i <ress985.length ; i++) {
            System.out.println(Arrays.toString(ress985[i]));
        }*/
//        System.out.println(ress985);

    }


}
