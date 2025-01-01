package Leetcode;

// public class Duplicate {
//     public static void main(String[] args) {
//         int[] nums={1,2,3,3};
//         int k=3;
//         Solution g=new Solution();
//         System.out.println(g.containsNearbyDuplicate(nums,k));
//     }
// }
public class Duplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,3};
        int k=3;
    Duplicate g=new Duplicate();
        System.out.println(g.containsNearbyDuplicate(nums,k));
    }
}