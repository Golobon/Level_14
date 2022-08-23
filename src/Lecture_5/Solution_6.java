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
        ArrayList<Integer> listMaxValue = new ArrayList<>(); // Создан доп. лист для внесения в него количества
        // повторяющихся значений.
        for (int i = 0; i < 10; i++) {
            intList.add(Integer.parseInt(bR.readLine()));
        }

        int count = 1; // Создал переменную, чтобы заносить в нее
        // +1 если значение элемента коллекции равно
        // значению следующего в коллекции числа.

        for (int i = 0; i < intList.size(); i++) {

            if (i == intList.size() - 1) {                       // Условие создано, чтобы не выйти за пределы колл-
                if (intList.get(i).equals(intList.get(i - 1))) { // лекции (break). Второй if создан, чтобы фиксировать
                    listMaxValue.add(count);                     // количество одинаковых значений коллекции при
                }                                                // условии, что последний элемент коллекции равен
                break;                                           // предшествующему.
            }

            if (intList.get(i).equals(intList.get(i + 1))) {     // Если текущий элемент коллекции равен следующему
                count++;                                         // увеличиваем count на 1.
            }

            if (!(intList.get(i).equals(intList.get(i + 1)))) {     // Если текущий элемент коллекции не равен следующему
                listMaxValue.add(count);                            // вносим в listMaxValue текущее значение count и
                count = 1;                                          // обнуляем count, поскольку повторения прекратились.
            }
        }
        Collections.sort(listMaxValue);                                     // Сортируем коллекцию listMaxValue по возрастанию.
        System.out.println(listMaxValue.get(listMaxValue.size() - 1));      // Выводим на экран самое большое количество повторений.
    }
}
