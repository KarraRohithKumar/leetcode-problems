package Leetcode;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] < target) {
                left = mid + 1;  // Search the right half
            } else {
                right = mid - 1;  // Search the left half
            }
        }
        
        // If the target is not found, left is the insertion point
        return left;
    }
}
public class Search_insert_position {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=3;
        Solution obj=new Solution();
        System.out.println(obj.searchInsert(nums,target));
    }
}