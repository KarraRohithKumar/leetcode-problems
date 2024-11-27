public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        // Create a boolean array to represent jewel types
        boolean[] isJewel = new boolean[128]; // ASCII characters range from 0 to 127
        
        // Mark jewel characters in the boolean array
        for (char jewel : jewels.toCharArray()) {
            isJewel[jewel] = true;
        }
        
        // Count the number of stones that are jewels
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (isJewel[stone]) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";  // Example input for jewels
        String stones = "aAAbbbb";  // Example input for stones

        int result = numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);
    }
}
