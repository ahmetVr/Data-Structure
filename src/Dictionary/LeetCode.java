package Dictionary;

import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {
     String order = "hlabcdefgijkmnopqrstuvwxyz";
    /*   String[] arr = {"Aerem", "Burak"};

        if ( arr[0].compareTo(arr[1]) < 0 ) {
            System.out.println("Ordered");
        } else {
            System.out.println("Not");
        }

    }
     */
        // vlı velı
        String[] words = {"hello","leetcode","kerem"};
        Map<Character, Integer> dictionary = new HashMap();
        for (int i = 0; i < 26; i++) {
            dictionary.put(order.charAt(i), i);
        }
        System.out.println(dictionary);
        for (int i = 0; i < words.length-1; i++){
            if(!check(words[i],words[i + 1],dictionary)) {
                System.out.println("Not");
            }
        }
    }

    public static boolean check(String str1,String str2,Map<Character,Integer> dict) {
        int min = Math.min(str1.length(),str2.length());
        for(int i = 0; i < min; i++) {
            int x = dict.get(str1.charAt(i));
            int y = dict.get(str2.charAt(i));
            if(dict.get(str1.charAt(i)) > dict.get(str2.charAt(i))) {
                return false;
            }
            if(dict.get(str1.charAt(i)) < dict.get(str2.charAt(i))) {
                return true;
            }
        }
        // Alık alı
        // aynı buyuk kucuk
        if (str2.length() < str1.length()) {
            return false;
        }
        return true;
    }
}