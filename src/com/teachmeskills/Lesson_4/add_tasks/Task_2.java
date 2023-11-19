package com.teachmeskills.Lesson_4.add_tasks;

/**
 * Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class Task_2 {

    public static void main(String[] args) {

        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        System.out.println("First matrix:");
        showMatrix(array1);
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        System.out.println("Second matrix:");
        showMatrix(array2);

        int newLength1=array1.length;
        int newLength2= array2[0].length;
        int[][] resultArray=new int[newLength1][newLength2];

        System.out.println("Result matrix:");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {
                for (int k = 0; k < resultArray[0].length; k++) {
                    resultArray[i][j]+=(array1[i][k]*array2[k][j]);
                }
            }
        }
        showMatrix(resultArray);

    }

    public  static void showMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}

