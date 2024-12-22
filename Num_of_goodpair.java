// public class Num_of_goodpair {
//     public static void main(String[] args) {
//         Solution obj=new Solution();
//         int[] nums={1,2,2,1,3};
//         System.out.println(obj.numIdenticalPairs(nums));

//     }
// }
public class Num_of_goodpair{
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start from i + 1
                if (nums[i] == nums[j]) {
                    count++; // Increment count for every good pair
                }
            }
        }
        return count; // Return the total count
    }
    public static void main(String[] args) {
        Num_of_goodpair obj=new Num_of_goodpair();
        int[] nums={1,2,2,1,3};
        System.out.println(obj.numIdenticalPairs(nums));

    }
}
