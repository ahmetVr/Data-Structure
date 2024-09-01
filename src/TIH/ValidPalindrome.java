package TIH;

import java.util.HashSet;
import java.util.Set;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < alphabet.length(); i++) {
            set.add(alphabet.charAt(i));
        }
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                res += s.charAt(i);
            }
        }
        String ans = "";
        for(int i = s.length()-1; i >= 0; i--) {
            if(set.contains(s.charAt(i))) {
                ans += s.charAt(i);
            }
        }
        if(!res.equals(ans)) {
            return false;
        }
        return true;
    }
}
