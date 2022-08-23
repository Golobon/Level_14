package Lecture_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_2 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        Class clList = list.getClass();
        Class clArrList = ArrayList.class;
        Class clLinList = LinkedList.class;
        if (clList.equals(clArrList)) {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        } else if (clList.equals(clLinList)) {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        }
    }

    public static void get10000(List list) {
        Class clList = list.getClass();
        Class clArrList = ArrayList.class;
        Class clLinList = LinkedList.class;
        if (clList.equals(clArrList)) {
            for (int i = 0; i < 10; i++) {
                list.get(i);
                System.out.print(list.get(i));
            }
            System.out.println();
        } else if (clList.equals(clLinList)) {
            for (int i = 0; i < 10; i++) {
                list.get(i);
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }

    public static void set10000(List list) {
        Class clList = list.getClass();
        Class clArrList = ArrayList.class;
        Class clLinList = LinkedList.class;
        if (clList.equals(clArrList)) {
            for (int i = 0; i < 10; i++) {
                list.set(i, "i");
                System.out.print(list.get(i));
            }
            System.out.println();
        } else if (clList.equals(clLinList)) {
            for (int i = 0; i < 10; i++) {
                list.set(i, "i");
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }

    public static void remove10000(List list) {
        Class clList = list.getClass();
        Class clArrList = ArrayList.class;
        Class clLinList = LinkedList.class;
        if (clList.equals(clArrList)) {
            for (int i = 9; i >= 0; i--) {
                list.remove(i);
            }
        } else if (clList.equals(clLinList)) {
            for (int i = 9; i >= 0; i--) {
                list.remove(i);
            }
        }
    }
}
