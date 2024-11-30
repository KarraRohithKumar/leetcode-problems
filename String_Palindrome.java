public class String_Palindrome {
    public static void main(String[] args) {
        String s="ksdfks89& fjvf";
        Solution obj=new Solution();
        System.out.println(obj.isPalindrome(s));
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder res = new StringBuilder(s);

res.reverse();
String k=new String(res);
    if(k==s){
        return true;
}return false;
    }
}
