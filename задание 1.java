import java.util.*;

public class ChisloX {
    public static List<int[]> findIndices(int[] arr, int X) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == X) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6};
        int X = 9;

        List<int[]> pairs = findIndices(arr, X);

        if (pairs.isEmpty()) {
            System.out.println("Нет элементов, сумма которых равна " + X);
        } else {
            for (int[] pair : pairs) {
                System.out.println("Индексы: " + pair[0] + ", " + pair[1]);
            }
        }
    }
}
