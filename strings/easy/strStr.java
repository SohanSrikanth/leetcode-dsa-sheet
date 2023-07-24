package strings.easy;

class Solution {
    public int strStr(String haystack, String needle) {
        int l = haystack.length();
        int ln = needle.length();
        if (l < ln) {
            return -1;
        }
        for (int i = 0; i <= l - ln; i++) {
            int j = 0;
            while (j < ln && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == ln) {
                return i;
            }
        }
        return -1;
    }
}