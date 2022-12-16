class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        int result = nums[0];
        for (int i = 1; i < size; i++)
            result = nums[i]^result;
        return result;
    }
}
 
