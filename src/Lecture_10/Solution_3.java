package Lecture_10;

import java.util.Map;
import java.util.HashMap;

public class Solution_3 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        for (Integer i = 0; i < 10; i++) {
            if (i < 5) {
                map.put(Integer.toString(i), "Bob");
            } else map.put("Bob", Integer.toString(i));
        }
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
