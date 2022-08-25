class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = ''.join(filter(str.isalnum, s)).lower()
        #print(s)
        if (len(s)==1):
            return "true"
        return s == s[::-1]
aaaasas
