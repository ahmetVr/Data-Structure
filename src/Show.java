import java.util.*;

public class Show {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr,2));
    }
    public static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i]) + 1);
            } else {
                map.put(arr[i],1);
            }
        }
        for(String str : arr) {
            if(map.get(str) == 1) {
                list.add(str);
            }
        }
        return list.get(k-1);
    }
}
