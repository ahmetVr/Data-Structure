package Questions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question21 {
    public static void main(String[] args) {
        String a = "serdengecti";
        String b = "gecsertiden";
        System.out.println(isAnagram(a,b));
    }
    static boolean isAnagram(String a, String b) {
        char[] strA = a.toLowerCase().toCharArray();
        char[] strB = b.toLowerCase().toCharArray();

        Arrays.sort(strA);
        Arrays.sort(strB);

        for(int i = 0; i < strB.length; i++) {
            if(strA[i] != strB[i]) {
                return false;
            }
        }
        return true;
    }
}
