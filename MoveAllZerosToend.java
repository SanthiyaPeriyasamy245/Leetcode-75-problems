import java.util.*;

public class MoveAllZerosToend {
    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 0, 0, 3, 4, 0, 0, 5 };
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[c] = arr[i];
                c++;
            }
        }
        for (int j = c; j < arr.length; j++) {
            arr[j] = 0;

        }
        System.out.println(Arrays.toString(arr));

    }
}
