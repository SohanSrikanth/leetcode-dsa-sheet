package strings.easy;

class Solution {
    public String intToRoman(int num) {
        String ans = "";
        int ar[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String arr[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < ar.length; i++) {
            while (num >= ar[i]) {
                ans += (String) arr[i];
                num -= ar[i];
            }
        }
        return ans;

    }
}