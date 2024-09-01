package Improve;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String[] str = {"a","b","c","d"};
        String[]  strings = {"a","a","a","c","e","e","c","e"};
        String[] strings2 = {"salt","tea","soda","toast"};
        String[] wordMultiple = {"a", "b", "a", "c", "b"};
        String[] allSwap = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by","ay", "by", "ax", "bx", "aj", "ai", "by", "bx"};
        Map<String,String> map = new HashMap<String,String>();
        for(int i = 0; i < strings2.length; i++) {
            String tmp = "" + strings2[i].charAt(0);
            if(!map.containsKey(tmp)) {
                map.put(tmp,strings2[i]);
            }else {
                map.put(tmp,map.get(tmp) + strings2[i]);
            }
        }
        System.out.println(map);

        Map<String,Boolean> map2 = new HashMap<>();
        for(int i = 0; i < wordMultiple.length; i++) {
            if(!map2.containsKey(wordMultiple[i])) {
                map2.put(wordMultiple[i],false);
            }else {
                map2.put(wordMultiple[i],true);
            }
        }

        Map<Character,Integer> map4 = new HashMap<>();
        String[] result = new String[allSwap.length];
        for(int i = 0; i < allSwap.length; i++) {
            char chr = allSwap[i].charAt(0);
            if(map4.containsKey(chr)) {
                int index = map4.get(chr);
                map.remove(chr);

                result[i] = result[index];
                result[index] = result[i];

            }else {
                map4.put(chr,i);
            }
        }
    }


}
