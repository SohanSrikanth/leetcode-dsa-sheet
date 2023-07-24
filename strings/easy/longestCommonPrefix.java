package strings.easy;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String cnt = "";
        int l = strs.length;
        int m = Math.min(strs[0].length(), strs[l - 1].length());
        for (int i = 0; i < m; i++) {
            if (strs[0].charAt(i) == strs[l - 1].charAt(i)) {
                cnt += strs[0].charAt(i);
            } else {
                break;
            }
        }
        return cnt;
    }
}