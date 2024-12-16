package Arrays;

import java.util.Arrays;

public class Top_K_Elements {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Find unique elements and their frequencies
        int n = nums.length;
        int[] unique = new int[n];
        int[] frequency = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == nums[i]) {
                    frequency[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount] = nums[i];
                frequency[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Step 2: Sort unique elements by frequency in descending order
        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = 0; j < uniqueCount - i - 1; j++) {
                if (frequency[j] < frequency[j + 1]) {
                    // Swap frequencies
                    int tempFreq = frequency[j];
                    frequency[j] = frequency[j + 1];
                    frequency[j + 1] = tempFreq;

                    // Swap corresponding unique elements
                    int tempElem = unique[j];
                    unique[j] = unique[j + 1];
                    unique[j + 1] = tempElem;
                }
            }
        }

        // Step 3: Extract the top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(topKFrequent(nums, k)));

        int[] nums2 = {4, 4, 4, 3, 3, 2, 2, 2, 1};
        k = 3;
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(topKFrequent(nums2, k)));
    }
}
