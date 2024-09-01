package Questions;

public class Question25 {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        String ans = "";
        for(String str : words) {
            for(int i = str.length()-1; i >= 0; i--) {
                ans += str.charAt(i);
            }
            if(str.equals(ans)) {
                return ans;
            }else {
                ans = "";
            }
        }
        return "";
    }

}
