package Lecture_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_5 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();

        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        return Collections.min(list);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int sizeList = Integer.parseInt(bR.readLine());
        List<Integer> list = new ArrayList<>(sizeList);
        for (int i = 0; i < sizeList; i++) {
            list.add(Integer.parseInt(bR.readLine()));
        }
        return list;
    }
}
