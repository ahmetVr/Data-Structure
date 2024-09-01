package Recursion;

public class Question8 {
    public static void main(String[] args) {

    }
    /*
    nestParen("(())") → true
    nestParen("((()))") → true
    nestParen("(((x)))") → false
     */

    public static boolean nestParen(String str) {
        if(str.length() == 0) {
            return true;
        }
        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')') {
            return nestParen(str.substring(1,str.length()-1));
        }
        return false;
    }

}
