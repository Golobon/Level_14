import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args){
        List <String> names = new ArrayList<>(Arrays.asList("John", "Bob", "Jack"));
        names.remove(1);
        System.out.println(names);
    }
}
