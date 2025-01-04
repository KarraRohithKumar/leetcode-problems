public class SeparateDigitsWithoutList {
    public static int[] separateDigits(int[] nums) {
        // Step 1: Calculate the total number of digits required
        int totalDigits = 0;
        for (int num : nums) {
            totalDigits += Integer.toString(num).length();
        }

        // Step 2: Create an array of appropriate size
        int[] result = new int[totalDigits];

        // Step 3: Populate the result array
        int index = 0;
        for (int num : nums) {
            int[] digits = getDigits(num);
            for (int digit : digits) {
                result[index++] = digit;
            }
        }

        return result;
    }

    // Helper method to extract digits of a number
    private static int[] getDigits(int num) {
        int length = Integer.toString(num).length();
        int[] digits = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {10921, 45, 678};

        // Separate digits
        int[] result = separateDigits(nums);

        // Print the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
