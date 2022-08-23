package Lecture_5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static Object createArrayList() {
        ArrayList<String> arrList = new ArrayList<>();
        return arrList;

    }

    public static Object createLinkedList() {
        LinkedList<String> linList = new LinkedList<>();
        return linList;

    }

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();
    }
}
