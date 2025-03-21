import java.util.ArrayList;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        ArrayList<Integer> numsList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                numsList.add(nums[i]);
                k += 1;
            }
        for(int j = 0; j < numsList.size(); j++) {
            nums[j] = (int)numsList.get(j);
            }
        
        }
        return k; 
    }
}