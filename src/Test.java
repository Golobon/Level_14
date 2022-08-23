import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        remove10000(list);
        System.out.println(list);
    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            /*if (list.isEmpty()) {
                return;
            }*/
            list.remove(0);
        }
    }
}
