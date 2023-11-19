package com.teachmeskills.Lesson_4.add_tasks;

/**
 * Создайте двумерный массив.
 * Выведите на консоль диагонали массива.
 */

public class Task_4 {

    public static void main(String[] args) {

        int n=4;
        int[][] array=new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j]=(int)(10*Math.random());
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Main diagonal= ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    System.out.print(+array[i][j]+" ");
                }
            }

        }

        System.out.println();
        System.out.print("Side diagonal= ");
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                System.out.print(array[i][j]+" ");
                i++;
            }

        }

    }

}
