package Questions;



public class Question10 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama"; //amanaplanacanalpanama --
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
       String ans = "";
       for(int i = 0; i < s.length(); i++) {
           if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
               ans +=  Character.toLowerCase(s.charAt(i));
           }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
               ans += s.charAt(i);
           }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
               ans += s.charAt(i);
           }
       }
       String result = "";
       for(int i = ans.length()-1; i >= 0; i--) {
           result += ans.charAt(i);
       }
       if(ans.equals(result)) {
           return true;
       }
       return false;
    }
}
