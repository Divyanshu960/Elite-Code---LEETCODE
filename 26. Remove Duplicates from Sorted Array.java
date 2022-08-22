class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; 
        if (n==1||n==0 )
            return n;
        int[] temp = new int[n];//create temp array of same size
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal to next
            // element then store that in a temp array
            if (nums[i] != nums[i + 1])
                temp[j++] = nums[i];
 
        // Store the last element if it's unique or
        temp[j++] = nums[n - 1];
 
        // Modify original array
        for (int i = 0; i < j; i++)
            nums[i] = temp[i];
 
        return j;
    }
}
