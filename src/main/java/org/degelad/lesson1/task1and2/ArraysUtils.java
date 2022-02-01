package org.degelad.lesson1.task1and2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author degelad
 */
public class ArraysUtils {
     static <T> void swap(T[] array, int indexOne, int indexTwo) {
        if (indexOne == indexTwo) {
            System.err.println("Index can't be identical");
            return;
        }

        if (indexOne < 0 || indexTwo < 0) {
            System.err.println("Index can't be less than zero");
            return;
        }

        if (array.length <= indexOne || array.length <= indexTwo) {
            System.err.println("Index can't be longer than array's length");
            return;
        }

        final T valueOne = array[indexOne];
        final T valueTwo = array[indexTwo];

        array[indexOne] = valueTwo;
        array[indexTwo] = valueOne;
    }

    public static <T> List<T> arrayConverter(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
