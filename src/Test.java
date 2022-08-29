import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
        Integer a = new Integer(3);
        Integer b = new Integer(3);
        Integer c = 3;
        Integer d = 3;
        Integer e = 333;
        Integer f = 333;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println();
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println();
        System.out.println(e==f);
        System.out.println(e.equals(f));

    }
}
