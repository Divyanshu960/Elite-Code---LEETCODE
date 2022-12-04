class Solution(object):
    def buildArray(self, nums):
        n = len(nums)

        for i, num in enumerate(nums):
            nums[i] += n * (nums[num] % n)

        for i in range(n):
            nums[i] //= n

        return nums
