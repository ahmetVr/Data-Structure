package Questions;

import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public static void main(String[] args) {
        String base = "Hello there";
        String remove = "llo";
        System.out.println(withoutString(base,remove));
    }
    /*
    Given two strings, base and remove,
    return a version of the base string where all instances of the remove string have been removed (not case sensitive).
    You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

    withoutString("Hello there", "llo") → "He there"
   withoutString("Hello there", "e") → "Hllo thr"
   withoutString("Hello there", "x") → "Hello there"

     */

    public static String withoutString(String base, String remove) { // hello there e
      String ans = "";
      int blen = base.length();
      int rlen = remove.length();
      for(int i = 0; i < blen-rlen; i++) {
          boolean flag = base.substring(i,i+rlen).equals(remove);
          if(flag) {
              i = i + rlen -1;
          }else if(i == blen-rlen) {
              ans += base.substring(i);
          }else {
              ans += base.charAt(i);
          }
      }
      return ans;
    }
    }

