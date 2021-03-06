package Sorting;

/**
 * Bubble sort is a sorting algorithm
 *
 * @author kkmonlee
 */
public class BubbleSort {

    /**
     * Bubble sort (descending order)
     * @param array array to be sorted
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
