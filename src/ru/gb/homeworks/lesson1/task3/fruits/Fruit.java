package ru.gb.homeworks.lesson1.task3.fruits;

public abstract class Fruit {
    private final Double weight;

    protected Fruit(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
}
