package Leetcode_day2;
// Example 1:

import java.util.Scanner;

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
public class Palindromee {
    public static boolean isPalindrome(int x) {
        int temp =x;
        String str = String.valueOf(temp);
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
         rev+=str.charAt(i);
                }
                return str.equals(rev);
    }
       /*  while (temp>0) {
            int k=temp%10;//121//12
            s=k+s*10;//1*10=10,120
            temp=temp/10;//12
        }
        return x==s;
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println(isPalindrome(sc.nextInt()));
    sc.close();
    }
}
