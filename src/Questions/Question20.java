package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question20 {
    public static void main(String[] args) {
        String s =  "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static  int firstUniqChar(String s) { // leetcode
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
