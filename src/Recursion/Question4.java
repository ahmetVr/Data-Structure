package Recursion;

import java.util.Locale;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(endX("xxre")); // rexx
        System.out.println(endX("xxhixx")); // hixxxx
        System.out.println(endX("xhixhix")); // hihixxx

    }

    public static String endX(String str) {
        if(str.length() == 0) {
            return str;
        }

        if(str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(1));



    }
}
