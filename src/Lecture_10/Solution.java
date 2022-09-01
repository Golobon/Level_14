package Lecture_10;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<>();
            set.add(new Cat("Bob"));
            set.add(new Cat("Bob1"));
            set.add(new Cat("Bob2"));
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        cats.forEach((obj) -> System.out.println(obj));
    }

    public static class Cat {
        public String name;
        public Cat (String name){
            this.name = name;
        }
    }
}
