import java.util.Arrays;

public class Decode_Array {
    public static int[] decode(int[] encoded, int first) {
        // Initialize the result array with size encoded.length + 1
        int[] arr = new int[encoded.length + 1];
        arr[0] = first; // The first element is already given

        // Decode the array using the formula: arr[i + 1] = encoded[i] XOR arr[i]
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        // Example test case
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] decodedArray = decode(encoded, first);

        // Print the result
        System.out.println("Decoded array: " + Arrays.toString(decodedArray));
    }
}
