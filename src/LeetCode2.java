public class LeetCode2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    /*
    "A man, a plan, a canal: Panama"
     */

    public static boolean isPalindrome(String s) {  //boolean
        String str = "";
        String s2 = "";
        for(int i = 0; i < s.length(); i++) {
            boolean checkLetter = Character.isLetter(s.charAt(i));
            if (s.charAt(i) != ' ' && checkLetter == true) {
                str += String.valueOf(s.charAt(i));
            }
        }
        for(int l = str.length()-1; l >= 0; l--) {
            s2 += String.valueOf(str.charAt(l));
        }
        if(str.equals(s2)) {
            return true;
        }
        return false;
    }
}
