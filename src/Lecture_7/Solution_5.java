package Lecture_7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class Solution_5 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("MARCH 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("FEBRUARY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> mappy : copy.entrySet()){
            if (mappy.getValue().getMonth() == 5 || mappy.getValue().getMonth() == 6 || mappy.getValue().getMonth() == 7){
                map.remove(mappy.getKey());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
    }
}
