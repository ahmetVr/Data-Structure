package Map;

import java.util.HashMap;
import java.util.Map;

public class MapQuestion {
    public static void main(String[] args) {
        String[]  strings = {"a","a","a","c","e","e","c","e"};
        String[] strings2 = {"salt", "tea", "soda", "toast"};
        String[] string3 = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(string3));
        //System.out.println(firstChar(strings2));
        // a: 3, c: 2, e: 3
       // System.out.println(word0(strings));
    }
 /*   Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
    but for this problem the value is simply 0.*/
    /*
    word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}

   word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}

   word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     */
 public static Map<String, Integer> word0(String[] strings) {
     Map<String,Integer> map = new HashMap<String,Integer>();
     for (int i = 0; i < strings.length; i++) {
         if (!map.containsKey(strings[i])) {
             map.put(strings[i],1);
         } else {
             map.put(strings[i], (map.get(strings[i]) + 1));
         }
     }
     return map;
 }


 /*
 firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}

firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}

firstChar([]) → {}
  */
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            String tmp = "" + strings[i].charAt(0);
            if (!map.containsKey(tmp)) {
                map.put(tmp, strings[i]);
            } else {
                map.put(tmp, map.get(tmp) + strings[i]);
            }
        }
        return map;
    }

    /*
    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}

   wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}

   wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */

    public static  Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            if(!map.containsKey(strings[i])) {
                map.put(strings[i],false);
            }else {
                map.put(strings[i],true);
            }
        }
        return map;
    }

    /*
    We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
     Loop over and then return the given array of non-empty strings as follows:
     if a string matches an earlier string in the array, swap the 2 strings in the array.
      When a position in the array has been swapped, it no longer matches anything. Using a map,
       this can be solved making just one pass over the array. More difficult than it looks.
     */
    /*
    allSwap(["ab", "ac"]) → ["ac", "ab"]

    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]

   allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
     */

    public static String[] allSwap(String[] strings) {
        Map<Character,Integer> map = new HashMap<>();
        String[] res = new String[strings.length];
        for(int i = 0; i < strings.length; i++) {
            char chr = strings[i].charAt(0);
            if(map.containsKey(chr)) {
                int k = map.get(chr);
                map.remove(chr);

                res[i] = res[k];
                res[k] = res[i];
            } else {
                res[i] = strings[i];
                map.put(chr,i);
            }
        }
        return res;
    }

}
