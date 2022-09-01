package Lecture_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_4 {
    public static void main(String[] args) {

        Human child1 = new Human("Bib1", true, 9);
        Human child2 = new Human("Biba2", false, 9);
        Human child3 = new Human("Bib3", true, 9);

        Human father = new Human("Bob", true, 30, child1, child2, child3);
        Human mother = new Human("Lila", false, 30, child1, child2, child3);


        Human grandPha1 = new Human("BilleBob1", true, 90, father);
        Human grandMa1 = new Human("Zina1", false, 90, father);

        Human grandPha2 = new Human("BillyBob2", true, 90, mother);
        Human grandMa2 = new Human("Zina2", false, 90, mother);

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
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
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
