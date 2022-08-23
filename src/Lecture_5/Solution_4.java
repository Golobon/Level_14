package Lecture_5;



import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution_4 {
    public static void main(String[] args) {
        Date start2 = new Date();
        System.out.println(getGetTimeInMs(fill(new ArrayList<>())));
        Date finish2 = new Date();
        long x2 = finish2.getTime() - start2.getTime();
        System.out.println(x2);
        Date start3 = new Date();
        System.out.println(getGetTimeInMs(fill(new LinkedList<>())));
        Date finish3 = new Date();
        long x3 = finish3.getTime() - start3.getTime();
        System.out.println(x3);
    }

    public static List<Object> fill(List<Object> list) {
        Date start4 = new Date();

        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        Date finish4 = new Date();
        long x4 = finish4.getTime() - start4.getTime();
        System.out.println(x4);
        return list;
    }

    public static long getGetTimeInMs(List<Object> list) {
        Date start = new Date();
        get10000(list);
        Date finish = new Date();
        return finish.getTime() - start.getTime();
    }

    public static void get10000(List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
