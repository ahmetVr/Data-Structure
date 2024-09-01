package Questions;

public class Question31 {
    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "9";
        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        String ans = "";
        int val = 0;
        while(i >= 0 || j >= 0 || val != 0) {
            int fNum = i >= 0 ? num1.charAt(i) - '0' : 0;
            int secNum = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = fNum+secNum+val;
            ans = (sum%10) + ans;
            val = sum/10;
            i--;
            j--;
        }
        return ans;
    }
}
