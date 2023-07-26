package math.easy;

import java.util.Arrays;

class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int min = nums[0];
        for (int i : nums) {
            ans += i - min;
        }
        return ans;
    }
}