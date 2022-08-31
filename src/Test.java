import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args){
        System.out.println(DayOfWeek.values()[0]);
    }

    public enum DayOfWeek {

        SUNDAY ("Воскресенье"),
        MONDAY ("Понедельник"),
        TUESDAY ("Вторник"),
        WEDNESDAY ("Среда"),
        THURSDAY ("Четверг"),
        FRIDAY ("Пятница"),
        SATURDAY ("Суббота");

        private String title;

        DayOfWeek(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "DayOfWeek{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }

    public class ScholarSchedule {

        private DayOfWeek dayOfWeek;
        //...другие поля


        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        public void setDayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }
    }

    public class Scholar {

        private ScholarSchedule schedule;
        private boolean goToSchool;

        public void wakeUp() {

            if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println("Ура, можно поспать еще!");
            } else {
                System.out.println("Блин, опять в школу:(");
            }
        }
    }
}
