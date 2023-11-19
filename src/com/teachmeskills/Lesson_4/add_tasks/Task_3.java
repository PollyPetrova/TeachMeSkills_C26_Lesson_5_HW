package com.teachmeskills.Lesson_4.add_tasks;

/**
 * Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */

public class Task_3 {

    public static void main(String[] args) {

        int[][] array=new int[3][5];

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(10*Math.random());
                System.out.print(array[i][j]+" ");
                sum+=array[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of elements= "+sum);

    }

}
