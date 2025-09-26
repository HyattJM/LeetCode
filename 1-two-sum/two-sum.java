class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans =  new int[2];
        for(int i = 0; i<nums.length; i++) {
            for(int index = 1; index<nums.length; index++){
                if (nums[i] + nums[index] == target && index != i) {
                    ans[0] = i;
                    ans[1] = index;
                    return ans;
                }
            }
        }
    return ans;
    }
}