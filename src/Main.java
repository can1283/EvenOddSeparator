import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-6, -3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        printEvenOddLists(arr);
    }

    public static void printEvenOddLists(int[] arr) {
        List<Integer> evenNumbersList = new ArrayList<>();
        List<Integer> oddNumbersList = new ArrayList<>();

        for (int arrItem : arr) {
            if (arrItem % 2 == 0) {
                evenNumbersList.add(arrItem);
            } else if (arrItem % 2 == 1 || arrItem % 2 == -1) {
                oddNumbersList.add(arrItem);
            } else {
                throw new RuntimeException("Invalid number: " + arrItem);
            }
        }

        System.out.println("Even numbers list: " + evenNumbersList);
        System.out.println("Odd numbers list: " + oddNumbersList);
    }
}
