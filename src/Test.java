import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dddd MMMM yyyy", Locale.ENGLISH);
        ArrayList<Date> list = new ArrayList<>();
        list.add(dateFormat.parse("1 may 2020"));
        System.out.println(list.get(0).getMonth());
        System.out.println(Collections.disjoint(solarSystemPart1, solarSystemPart2));
        System.out.println("Хоп");
    }
}
