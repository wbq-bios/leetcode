import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-27 06:37
 **/
public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        //[-1,2,3,1]
        List<Integer> ans=new LinkedList<>();
        for (int i = 0; i <nums.length; i++) {
            int index=Math.abs(nums[i])-1;
            if (nums[index]>0){
                nums[index]=-nums[index];
            }else {
                ans.add(Math.abs(index)+1);
            }
        }
        return ans;
    }
}
