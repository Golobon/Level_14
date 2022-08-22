package Lecture_3;

import java.util.HashMap;
import java.util.Map;

public class Solution_2 {
    public static void main(String[] args) {
        String str = "арбуз ягода " +
                "банан трава " +
                "вишня ягода " +
                "груша фрукт " +
                "дыня овощ " +
                "ежевика куст " +
                "жень-шень корень " +
                "земляника ягода " +
                "ирис цветок " +
                "картофель клубень ";
        String[] string = str.split(" ");
        Map<String, String> map = new HashMap<>();
        int i = 0, j = 1;
        while (i < 20) {
            map.putIfAbsent(string[i], string[j]);
            i = i + 2;
            j = j + 2;
        }
        map.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
    }
}
