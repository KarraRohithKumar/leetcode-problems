package Leetcode;

import java.util.Scanner;



public class Evendigits{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask for the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Declare the array
        int[] nums = new int[n];
sc.close();
        // Take input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // You can now pass this array to your solution function or use it as needed
    Evendigits sol = new Evendigits();
        int result = sol.findNumbers(nums);

        // Output the result
        System.out.println( result);
    }

    // Your findNumbers method (same as previously corrected)
   public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int k = 0; // Reset k for each number

            while (num > 0) {
                num = num / 10; // Use integer division to reduce the number
                k++;
            }

            if (k % 2 == 0) 
                      count++;
        }

        return count;
    }
}
