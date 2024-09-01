package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ahmet",11);
        map.put("Kerem",2);
        map.put("Fatih",3);
        System.out.println(map.keySet());

    }
}
