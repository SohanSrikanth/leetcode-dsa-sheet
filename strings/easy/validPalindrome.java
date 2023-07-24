package strings.easy;

class Solution {
    public boolean validPalindrome(String s) {
        int l = s.length();
        int i = 0;
        int j = l - 1;
        // int c=0;
        while (i < j) {
            // if(c>1){
            // return false;
            // }
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return validPalindromeTill(s, i + 1, j) || validPalindromeTill(s, i, j - 1);
            }
        }
        return true;
    }

    public boolean validPalindromeTill(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}