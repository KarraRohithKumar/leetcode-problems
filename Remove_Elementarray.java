package Leetcode;

 
import java.util.Arrays;

public class Remove_Elementarray {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of non-val elements
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, move it to the k-th position
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k; // Return the count of non-val elements
    }

    public static void main(String[] args) {
        Remove_Elementarray solution = new Remove_Elementarray();
        
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = solution.removeElement(nums, val);
        
        // Output the result
        System.out.println("Number of elements not equal to val: " + k);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
