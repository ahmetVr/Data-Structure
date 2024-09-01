package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question29 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
                list.add(arr[i]);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = map.get(list.get(i));
        }
        int ans = result[0];
        for(int i = 1; i < result.length; i++) {
            if(result[i] == ans) {
                return false;
            }else {
                ans = result[i];
            }
        }
        return true;
    }

}
