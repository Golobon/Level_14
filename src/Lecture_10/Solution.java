package Lecture_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iter = cats.iterator();
        iter.next();
        iter.remove();
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(new Cat());
        }
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        cats.forEach((obj) -> System.out.println(obj));
    }

    public static class Cat {
    }
}
