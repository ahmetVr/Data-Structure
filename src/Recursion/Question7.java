package Recursion;

public class Question7 {
    public static void main(String[] args) {
        System.out.println(pairStar("hello")); // hel*lo
        System.out.println(pairStar("xxyy")); // x*xy*y
        System.out.println(pairStar("aaaa")); // a*a*a*a
    }

    public static String pairStar(String str) {

        if(str.length() <= 1) {
            return str;
        }
        if(str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) +  pairStar(str.substring(1));
    }
}
