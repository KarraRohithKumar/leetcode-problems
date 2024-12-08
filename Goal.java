/*package Leetcode;

public class Goal {
    public static void main(String[] args) {
        String command="G()()(al)";
        int[] indices= new int[] {4,5,6,7,0,2,1,3};
        Solution obj=new Solution();
        System.out.println(obj.interpret(command));
}
}

class Solution {
    public String interpret(String command) {
        String a="";
        for (int index = 0; index < command.length()-1; index++) {
           command =command.replace("()","o");
           command=command.replace("(al)","al");
            }
    return command;
        }}*/