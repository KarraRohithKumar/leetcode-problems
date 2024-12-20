package Leetcode;

import java.util.Scanner;

public class duplicates {
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
            duplicates sol = new duplicates();
            int result = sol.removeDuplicates(nums);
            System.out.println(result);

        }
    }

    public int removeDuplicates(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    count++;
                }

            }

        }
        return count;
    }

}