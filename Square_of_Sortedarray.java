package Leetcode;

import java.util.Arrays;

public class Square_of_Sortedarray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {-4, -1, 0, 3, 10}; // Example input
        int[] result = obj.sortedSquares(nums);
        
        // Print the result array in array format
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // Array to store sorted squares
        int left = 0, right = n - 1; // Two pointers at the start and end
        int index = n - 1; // Start filling result array from the last position

        while (left <= right) {
            int leftSquare = nums[left] * nums[left]; // Square of the left element
            int rightSquare = nums[right] * nums[right]; // Square of the right element
            
            if (leftSquare > rightSquare) {
                result[index] = leftSquare; // Place the larger square
                left++; // Move the left pointer forward
            } else {
                result[index] = rightSquare; // Place the larger square
                right--; // Move the right pointer backward
            }
            index--; // Move to the next position in result array
        }

        return result; // Return the sorted squares array
    }
}
