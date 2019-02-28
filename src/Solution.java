import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: wbq
 * @create: 2019-02-20 20:33
 **/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> res =new HashMap<>();
        int length=nums.length;
        int[] ans=new int[2];
        for(int i=0;i<length;i++){
            int odd=target-nums[i];
            if(res.containsKey(odd)){
                ans[0]=i;
                ans[1]=res.get(odd);

            }
            res.put(nums[i],i);
        }
        return ans;
    }
}
