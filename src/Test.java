import java.text.ParseException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ParseException {
        int[] arr = new int[]{1000, 900, 800, 5, 1, 2, 300, -142, 123, 12, 32, -300, -400, -500};
        for (int i = arr.length-1; i >= 1; i--) {
            int[] arr2 = arr.clone();
            for (int j = 0; j < i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int shift = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = shift;
                }
            }
            arr = arr2.clone();
            System.out.println(Arrays.toString(arr));
        }
    }
}
