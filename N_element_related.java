
    

    public class N_element_related {
    public static int repeatedNTimes(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int index = i+1 ; index < nums.length; index++) {
                    
                
                if(nums[i]==nums[index]){
                    return nums[i];
                }
            }
        }return 0;
        }
    public static void main(String[] args) {
        N_element_related obj=new N_element_related();
        int[] nums={1,2,1,3,1};
        System.out.println(repeatedNTimes(nums));
}}