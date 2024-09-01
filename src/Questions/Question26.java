package Questions;

public class Question26 {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {0,8,13,15};
        System.out.println(addSpaces(s,spaces));
    }
    public static  String addSpaces(String s, int[] spaces) {
      int idx = 0;
      String ans = "";
          for(int i = 0; i < s.length(); i++) {
              if(i == spaces[idx] -1 ) {
                  if(idx == spaces.length-1) {
                      ans += s.charAt(i) + " ";
                  }else {
                      ans += s.charAt(i) + " ";
                      idx++;
                  }
              }else {
                  ans += s.charAt(i);
              }
          }
      return ans;
    }
}
