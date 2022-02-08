package ru.gb.homeworks.lesson1.task3;

import ru.gb.homeworks.lesson1.task3.fruits.Apple;
import ru.gb.homeworks.lesson1.task3.fruits.Orange;

public class Main {
    public static void main(String[] args) {


        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());



        System.out.println("appleBox.getWeight() = " + appleBox.getWeight());
        System.out.println("orangeBox.getWeight() = " + orangeBox1.getWeight());

        System.out.println("appleBox.compare(orangeBox) = " + appleBox.compare(orangeBox1));

        Box<Orange> toBox = new Box<>();
        orangeBox1.putAll(toBox);

        Box<Apple> toBox1 = new Box<>();
        appleBox.putAll(toBox1);
    }
}
