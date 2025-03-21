class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1; // Pointer for the position of the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // If a new unique element is found
                nums[k] = nums[i]; // Move it to the next position
                k++; // Increment the count of unique elements
            }
        }
        return k;
    }
}
