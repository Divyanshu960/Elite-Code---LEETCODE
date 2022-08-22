class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;//get the length of array
        for (int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)//check numbers before 9s and increase them by 1
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] temp = new int[n+1];//for cases when there are more than one 9s
        temp[0]=1;
        return temp;
    }
}
