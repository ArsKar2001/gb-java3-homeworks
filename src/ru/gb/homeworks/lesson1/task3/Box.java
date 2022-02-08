package ru.gb.homeworks.lesson1.task3;

import ru.gb.homeworks.lesson1.task3.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {
    private final List<F> fruits;

    public Box(List<F> fruits) {
        this.fruits = fruits;
    }

    public Box() {
        fruits = new ArrayList<>();
    }

    public double getWeight() {
        return fruits.stream()
                .mapToDouble(Fruit::getWeight)
                .sum();
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public void putAll(Box<F> toBox) {
        toBox.getFruits().addAll(fruits);
        fruits.clear();
    }

    public boolean add(F fruit) {
        return fruits.add(fruit);
    }

    public List<F> getFruits() {
        return fruits;
    }
}
