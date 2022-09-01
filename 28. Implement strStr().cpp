class Solution {
public:
    int strStr(string haystack, string needle) {
        int l = needle.size();
        if (haystack.size() < l) return -1;
        for (int idx=0; idx <= haystack.size()- l; idx++){
            if (string (haystack.begin()+idx, haystack.begin()+idx+l) == needle) return idx;
        }
        return -1;
    }
};
