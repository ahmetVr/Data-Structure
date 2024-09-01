package Questions;

public class Question19 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int max = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                ans++;
                if(ans > max) {
                    max = ans;
                }
            }else if(s.charAt(i) == ')') {
                ans--;
            }
        }
        return max;
    }
}
