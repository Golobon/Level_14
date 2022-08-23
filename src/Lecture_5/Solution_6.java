package Lecture_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections; //добавил Collections, чтобы вызвать метод sort
import java.util.List;


public class Solution_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intList.add(Integer.parseInt(bR.readLine()));
        }

        int count = 1;
        int max = 0;

        for (int i = 0; i < intList.size(); i++) {

            if (i == intList.size() - 1) {
                if (intList.get(i).equals(intList.get(i - 1))) {
                    if (count > max) max = count;
                }
                break;
            }

            if (intList.get(i).equals(intList.get(i + 1))) {
                count++;
            }

            if (!(intList.get(i).equals(intList.get(i + 1)))) {
                if (count > max) max = count;
                count = 1;
            }
        }
        System.out.println(max);
    }
}
