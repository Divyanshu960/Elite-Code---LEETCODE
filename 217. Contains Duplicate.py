class Solution(object):
    def containsDuplicate(self, nums):
        x = set(nums)
        if len(x)!=len(nums):
            return True
        else:
            return False
