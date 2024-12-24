package Leetcode;
public class Binary_search {
    public static void main(String[] args) {
        
    
    int[] nums={1,2,3,4};
    int target=3;
    Solution obj=new Solution();
    System.out.println(obj.search(nums,target));
}}
class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }return -1;
    }
}
