package Lecture_7;

import java.util.Map;
import java.util.HashMap;


public class Solution_6 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i = i + 100) {
            map.put("B" + i, i);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> mappy : copy.entrySet()) {
            if (mappy.getValue() < 500) {
                map.remove(mappy.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map x = createMap();
        removeItemFromMap(x);
        System.out.println(x);
        System.out.println(x.size());
    }
}
