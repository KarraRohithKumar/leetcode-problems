package Arrays;

public class Array_Sum {
    public int[] twoSum(int[] nums, int target) {
        int [] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    index[0]=i;
                    index[1]=j;
                    
                    
                }
                    }
                }
        return index;
    }
    public static void main(String[] args) {
        int [] nums ={3,2,4};
        int target=6;
        Array_Sum nc =new Array_Sum();
        
        for (int i: nc.twoSum(nums,target) ) {
            System.out.print(i+" ");
        }
        }
}
