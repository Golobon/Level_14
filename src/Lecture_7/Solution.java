package Lecture_7;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            String s = "Л" + i;
            set.add(s);
        }
        return set;
    }

    public static void main(String[] args) {
    }
}
