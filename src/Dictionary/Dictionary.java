package Dictionary;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        Map<String,Integer> dictionary = new HashMap<>();

        dictionary.put("cheery",20);
        dictionary.put("bıtter choc.",3);
        dictionary.put("apple",1);
        dictionary.put("banana",5);
        dictionary.put("Apple",100);

        System.out.println(dictionary.size());

        System.out.println(dictionary.get("banana"));
        dictionary.remove("banana"); //O(1) n kat daha hızlı
        dictionary.put("cheery",dictionary.get("cheery")+5);
        System.out.println(dictionary.get("banana"));
        System.out.println(dictionary);
        dictionary.put("apple",10);
        System.out.println(dictionary);
    }
}


/*

    [24,30,60,11,.....,23] -> ages

    ["Book1": 24,"Ahmet":30,......,"Velı": 23,"Can": 11] Dıctıonary // Speed O(1) // HASHTABLE
    // key,value

        Map
        |
    Hashtable
        |
    Dıctıonary
 */
