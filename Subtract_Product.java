package Leetcode;

public class Subtract_Product {
    public static void main(String[] args) {
         int n=123;
         Solution k=new Solution();
         System.out.println(k.subtractProductAndSum(n));
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1; // Initialize sum and product

        while (n > 0) {
            int digit = n % 10;  // Extract the last digit
            sum += digit;       // Add digit to sum
            product *= digit;   // Multiply digit to product
            n /= 10;            // Remove the last digit
        }
        
        return product - sum; // Return the difference
    }
}
