package org.degelad.lesson1.task1and2;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author degelad
 */
public class MainApp {
     public static void main(String[] args) {
        // Task 1
        final Integer[] intArray = {0, 1};
        ArraysUtils.swap(intArray, 0, 1);
        System.out.println(Arrays.toString(intArray));

        // Task 2
        final List<Integer> intArrayList = ArraysUtils.arrayConverter(intArray);
        System.out.println(Arrays.toString(intArrayList.toArray()));
    }

}
