package Leetcode;

public class Remove_Dupli_Insortedarray {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        Solution obj=new Solution();
        System.out.println(obj.removeDuplicates(nums));
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: Empty array
        
        int k = 1; // Index for placing unique elements (starts at 1 because nums[0] is always unique)
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if current element is not equal to the previous one
                nums[k] = nums[i]; // Place the unique element at index 'k'
                k++; // Move the index for the next unique element
            }
        }
        
        return k; // Return the count of unique elements
    }
}
