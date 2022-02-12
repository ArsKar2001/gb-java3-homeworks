package ru.gb.homeworks.lesson1;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Integer[] intData = {2, 34, 23, 2345, 23, 43, 234, 234, 45, 56, 345, 345};
        System.out.println(Arrays.toString(intData));


        replace(intData, 1, 5);

        System.out.println(Arrays.toString(intData));
    }

    public static  <T> void replace(T[] data, int indexFrom, int indexTo) {
        T buf = data[indexFrom];
        data[indexFrom] = data[indexTo];
        data[indexTo] = buf;
    }
}
