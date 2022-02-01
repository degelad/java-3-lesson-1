package org.degelad.lesson1.task3;

import org.degelad.lesson1.task3.fruit.Apple;
import org.degelad.lesson1.task3.fruit.Orange;

/**
 *
 * @author degelad
 */
public class Main {
    public static void main(String[] args) {
        final Box<Apple> boxApples = new Box<>(
                new Apple(),
                new Apple(),
                new Apple()
        );
        final Box<Orange> boxOranges = new Box<>(
                new Orange(),
                new Orange(),
                new Orange()
        );
        System.out.println(boxApples.getWeight());
        System.out.println(boxOranges.getWeight());
        System.out.println(boxApples.compare(boxOranges));
        final Box<Apple> newBoxApples = new Box<>(
                new Apple(),
                new Apple()
        );
        boxApples.fill(newBoxApples);
        System.out.println(boxApples.getWeight());
    }
}
