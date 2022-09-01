package Lecture_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Solution_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String cityKey = reader.readLine();
            if (cityKey.isEmpty()) {
                break;
            }
            String familyValue = reader.readLine();
            map.put(cityKey, familyValue);
        }
        System.out.println(map.get(reader.readLine()));
    }
}
