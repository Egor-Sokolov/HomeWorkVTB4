package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> T[] SwapElementArray(T[] array, int SwapIndexFirst, int SwapIndexSecond){
        T temp =array[SwapIndexSecond];
        array[SwapIndexSecond]=array[SwapIndexFirst];
        array[SwapIndexFirst] = temp;
        return array;
    }


    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }


    public static void main(String[] args) {

        // Задача 1. Написать метод, который меняет два элемента массива местами.
        // (массив может быть любого ссылочного типа);
        String[] arrayString = new String[]{"A", "BB", "CCC", "DDDD"};
        System.out.println("Task 1\n" + Arrays.toString(SwapElementArray(arrayString, 1, 2)));

        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = convertToList(arrayString);
        System.out.println("Task 2\n" + list.getClass() + " : " + list);

        //Задача 3. Коробки с фруктами
        System.out.println("Task 3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
//            orangeBox1.moveAt(appleBox);   Error

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }


    }




