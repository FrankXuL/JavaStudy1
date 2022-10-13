package JavaSE;

/**
 * @title: Java32
 * @Author Xu
 * @Date: 2022/8/2 16:36
 * @Version 1.0
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Java32 {
    public static void main(String[] args) {
        int[] nums= new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count = 1;
        int sum =nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == sum){
                count++;
            }
            if(nums[i] != sum){
                count--;
            }
            if(count ==0){
                sum = nums[i+1];
            }
        }
        return sum;
    }
}