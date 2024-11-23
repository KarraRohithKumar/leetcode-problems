public class Power_Of_Two {
   public static void main(String[] args) {
    Solution obj=new Solution();
   System.out.println( obj.isPowerOfTwo(6));
   } 
}
class Solution{
public boolean isPowerOfTwo(int n) {
    if (n <= 0) return false; // Negative numbers or zero are not powers of two
    while (n % 2 == 0) {
        n /= 2;
    }
    return n == 1;
}
}