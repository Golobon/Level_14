package Lecture_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_4 {
    public static void main(String[] args) {
        ArrayList<Human> nonChild = new ArrayList<>();

        Human child1 = new Human("Bib1", true, 9, nonChild);
        Human child2 = new Human("Biba2", false, 9, nonChild);
        Human child3 = new Human("Bib3", true, 9, nonChild);
        ArrayList<Human> child = new ArrayList<>();
        child.add(child1);
        child.add(child2);
        child.add(child3);

        Human father = new Human("Bob", true, 30, child);
        ArrayList<Human> grand1Child = new ArrayList<>();
        grand1Child.add(father);

        Human mother = new Human("Lila", false, 30, child);
        ArrayList<Human> grand2Child = new ArrayList<>();
        grand2Child.add(mother);

        Human grandPha1 = new Human("BilleBob1", true, 90, grand1Child);
        Human grandMa1 = new Human("Zina1", false, 90, grand1Child);

        Human grandPha2 = new Human("BillyBob2", true, 90, grand2Child);
        Human grandMa2 = new Human("Zina2", false, 90, grand2Child);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandPha1);
        System.out.println(grandMa1);
        System.out.println(grandPha2);
        System.out.println(grandMa2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
