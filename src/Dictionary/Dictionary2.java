package Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary2 {
    public static void main(String[] args) {
        Map<String,Integer> dictionary = new HashMap();

        dictionary.put("Ahmet",30);
        dictionary.put("Aslı",25);
        dictionary.put("Tugay",30);
        dictionary.put("Melike",26);
        System.out.println(dictionary);
        System.out.println(dictionary.get("Tugay"));
        dictionary.put("Tugay",dictionary.get("Tugay")+2);
        System.out.println(dictionary.get("Tugay"));
        dictionary.remove("Ahmet");
        dictionary.remove("Aslı");
        System.out.println(dictionary);
        dictionary.put("Ahmet",31);
        dictionary.put("Aslı",256);
        dictionary.put("Aslı",dictionary.get("Aslı")-230);
        dictionary.remove("Tugay");
        dictionary.remove("Melike");
        System.out.println(dictionary);


    }
}
