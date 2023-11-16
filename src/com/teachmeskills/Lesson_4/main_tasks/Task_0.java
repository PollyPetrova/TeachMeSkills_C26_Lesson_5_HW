package com.teachmeskills.Lesson_4.main_tasks;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */
public class Task_0 {

    public static void main(String[] args) {

        //Ввод числа, на которое будет увеличены элементы массива
        System.out.println("Enter the number to increase elements of array: ");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        //Заполнение массива
        int[][][] array=new int[3][4][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for(int k = 0; k < 2; k++) {
                    array[i][j][k]=(int)(100*Math.random());
                    //System.out.print(array[i][j][k]+" ");
                }
                //System.out.println();
            }
        }
        System.out.println("Array= "+Arrays.deepToString(array));

        //Увеличение элементов массива на заданное число
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for(int k = 0; k < 2; k++) {
                    array[i][j][k]+=num;
                    //System.out.print(array[i][j][k]+" ");
                }
                //System.out.println();
            }
        }
        System.out.println("Changed array= "+Arrays.deepToString(array));

    }

}
