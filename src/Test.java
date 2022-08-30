import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args){
        var names = Arrays.asList("John", "John", "Jack");
        names = new ArrayList<>(names);
        /*Consumer consumer = (obj) -> System.out.println(obj.hashCode());
        consumer.andThen((obj) -> System.out.print("ff" + "\n"));
        names.forEach(consumer.andThen((obj) -> System.out.print("ff")));*/
        Predicate predicate = (obj) -> obj.equals("John");
        names.removeIf(predicate);
        System.out.println(names);
    }
}
