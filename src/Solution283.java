/**
 * @description:
 * @author: wbq
 * @create: 2019-03-04 01:17
 **/
public class Solution283 {
    //原始人办法
    // 34ms
    public int[] moveZeroes(int[] nums) {
        int endZero=nums.length-1;
        int tempi;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]==0){
                tempi=i;
                for (int j = i+1; j <nums.length ; j++) {
                    nums[tempi]=nums[j];
                    tempi++;
                }
                nums[endZero]=0;
                endZero--;
            }
        }
        return nums;
    }
//双指针法，将不是0的元素全往前挪，然后将末尾置0；
/*    public int[] moveZeroes(int[] nums) {
        int i = 0,j = 0;
        for(i = 0 ; i < nums.length; i++){
            if(nums[i] != 0)
            {
                nums[j++] = nums[i];
            }
        }
        while(j < nums.length){
            nums[j++] = 0;
        }
        return nums;
    }*/
}
