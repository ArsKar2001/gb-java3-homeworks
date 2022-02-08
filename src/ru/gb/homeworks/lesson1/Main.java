package ru.gb.homeworks.lesson1;

import java.util.Arrays;
import java.util.List;

public class Main {

    static class Replacement<T> {
        private final T[] data;

        Replacement(T[] data) {
            this.data = data;
        }

        public void replace(int indexFrom, int indexTo) {
            T a = data[indexFrom];
            data[indexFrom] = data[indexTo];
            data[indexTo] = a;
        }

        public List<T> toList() {
            return Arrays.asList(data);
        }
    }

    public static void main(String[] args) {
        Integer[] intData = {2, 34, 23, 2345, 23, 43, 234, 234, 45, 56, 345, 345};
        System.out.println(Arrays.toString(intData));

        Replacement<Integer> replacement = new Replacement<>(intData);
        replacement.replace(0, 3);

        System.out.println(Arrays.toString(intData));
    }
}
