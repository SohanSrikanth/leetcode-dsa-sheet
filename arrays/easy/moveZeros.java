class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[a++] = n;
            }
        }
        while (a < nums.length) {
            nums[a++] = 0;
        }
    }
}

// class Solution {
// public void moveZeroes(int[] nums) {
// int cnt=0;
// for(int i=0;i<nums.length;i++){
// if(nums[i]==0){
// cnt++;
// }
// else if(cnt>=1){
// nums[i]=nums[i]+nums[i-cnt];
// nums[i-cnt]=nums[i]-nums[i-cnt];
// nums[i]=nums[i]-nums[i-cnt];
// }
// }

// }
// }