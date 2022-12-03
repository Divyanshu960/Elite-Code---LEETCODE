class Solution:
    def myAtoi(self, s: str) -> int:
        s = re.findall(r'^\s*[+-]?\d+', s)
        try:
            MAX, MIN = 2147483647, -2147483648
            res = int(''.join(s))
            if res > MAX:
                return MAX
            if res < MIN:
                return MIN
            return res
        except:
            return 0
