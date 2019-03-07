import com.solution1d200.s1d50.Solution11;
import com.solution1d200.s1d50.Solution13;
import com.solution1d200.s1d50.Solution14;
import com.solution401d600.s401d450.Solution448;
import com.solution401d600.s451d500.Solution485;
import com.solution401d600.s451d500.Solution495;
import com.solution801d1000.s851d900.Solution888;
import com.solution801d1000.s851d900.Solution896;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution495 running985 = new Solution495();
        //int [][] init={{1,2,3,4},{5,1,2,3},{9,5,1,2}};2^31=-2147483648
        //int[][] a={{10,2,5},{10,9,1},{1,4,3},{1,2,3}};
        int ress985= running985.findPoisonedDuration(new int[]{1,5,9},4);
        System.out.println(ress985);
        //System.out.println(ress985.get(1));
        //System.out.println(ress985.get(1));
        /*for (int i = 0; i <ress985.length ; i++) {
            System.out.println(Arrays.toString(ress985[i]));
        }*/
//        System.out.println(ress985);

    }


}
