package Lecture_7;

import java.util.HashSet;
import java.util.Set;

public class Solution_2 {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(s -> s > 10);
    }

    public static void main(String[] args) {
        Set x = createSet();
        removeAllNumbersGreaterThan10(x);
        System.out.println(x);
    }
}
