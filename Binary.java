package Leetcode;

public class Binary {
    public static void main(String[] args) {
        int n = 11;
        Solution m = new Solution();
        System.out.println(m.hammingWeight(n));
    }
}

class Solution {
    public int hammingWeight(int n) {
        int k = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
             k++;
            }

        }
        return k;
    }
}