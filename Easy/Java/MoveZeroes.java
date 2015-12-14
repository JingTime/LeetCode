public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                index++;
                int tmp = nums[index];
                nums[index] = nums[i];
                nums[i]= tmp;
            }
        }
    }
}
