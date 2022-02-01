package org.degelad.lesson1.task3;
import java.util.List;
import org.degelad.lesson1.task1and2.ArraysUtils;
import org.degelad.lesson1.task3.fruit.Apple;
import org.degelad.lesson1.task3.fruit.Fruit;
import org.degelad.lesson1.task3.fruit.Orange;
/**
 *
 * @author degelad
 */
class Box<T extends Fruit> {
    private List<T> storage;
    @SafeVarargs
    Box(T... storage) {
        this.storage = ArraysUtils.arrayConverter(storage);
    }
    float getWeight() {
        float weight = -1f;
        if (storage.get(0) instanceof Apple) weight = storage.size() * 1.0f;
        if (storage.get(0) instanceof Orange) weight = storage.size() * 1.5f;
        return weight;
    }
    boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
    private void add(T value) {
        storage.add(value);
    }
    void fill(Box<T> box) {
        for (int i = 0; i <= box.storage.size(); i++) {
            add(box.storage.remove(0));
        }
    }
}
