import java.util.Comparator;

/**
 * Клас MergeSort реалізує алгоритм сортування злиттям для масиву {@link Automobile}.
 */
public class MergeSort {

    /**
     * Виконує сортування масиву {@code array} об'єктів {@link Automobile} з використанням алгоритму сортування злиттям.
     *
     * @param array масив об'єктів {@link Automobile} для сортування
     * @param comparator компаратор для порівняння об'єктів {@link Automobile}
     */
    public static void mergeSort(Automobile[] array, Comparator<Automobile> comparator) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        Automobile[] left = new Automobile[mid];
        Automobile[] right = new Automobile[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(array, left, right, comparator);
    }

    /**
     * Об'єднує два підмасиви {@code left} та {@code right} у відсортований масив {@code array}.
     *
     * @param array вихідний масив, у який злиті елементи {@code left} та {@code right}
     * @param left лівий підмасив
     * @param right правий підмасив
     * @param comparator компаратор для порівняння об'єктів {@link Automobile}
     */
    private static void merge(Automobile[] array, Automobile[] left, Automobile[] right, Comparator<Automobile> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
