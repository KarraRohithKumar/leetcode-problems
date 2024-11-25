package Leetcode;

public class Missing_Num {
    public static void main(String[] args) {
        Solution k=new Solution();
        int[] nums={0,1};
        System.out.println(k.missingNumber(nums));
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num; // Sum of elements in the array
        }

        return expectedSum - actualSum; // The missing number
    }
    }
