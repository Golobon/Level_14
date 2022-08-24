package Lecture_7;

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
    public static Map<String, String> createMap() {
        Map <String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Янов" + i, "Петр" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> map1: map.entrySet()) {
            if (map1.getValue().equals(name)){
                count++;
            }
        }
        return count;
    }

   public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
       int count = 0;
       for (Map.Entry<String, String> map1: map.entrySet()) {
           if (map1.getKey().equals(lastName)){
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toString(getCountTheSameFirstName(createMap(), "Петр1")));
        System.out.println(Integer.toString(getCountTheSameLastName(createMap(), "Янов11")));
    }
}
