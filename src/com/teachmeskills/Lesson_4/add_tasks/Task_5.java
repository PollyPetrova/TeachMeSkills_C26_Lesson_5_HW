package com.teachmeskills.Lesson_4.add_tasks;

import java.util.Arrays;

/**
 * Создайте двумерный массив целых чисел.
 * Отсортируйте элементы в строках
 * двумерного массива по возрастанию.
 */

public class Task_5 {

    public static void main(String[] args) {

        int[][] array=new int[3][5];

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(10*Math.random());
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Sort array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Arrays.sort(array[i]);
            }
            System.out.println(Arrays.toString(array[i]));
        }

    }

}
