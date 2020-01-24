package com.alex.task05_01;

public class Homework05Task01 {
    static int[] creatArray(int x) {
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random()*100));
        }
        return array;
    }

    static int[] printArray(int[] arr){
        int[] array = new int[arr.length];
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        return array;
    }

    static int[] addArrays(int[] arr1, int[] arr2){
        int[] sumArrays = new int [arr1.length];
        for(int i = 0; i < arr1.length; i++){
            sumArrays[i] = arr1[i] + arr2[i];
        }
        return sumArrays;
    }

    public static void main(String[] args) {
        int[] array1 = creatArray(5);
        int[] array2 = creatArray(5);

        System.out.print("Первый массив: ");
        printArray(array1);

        System.out.print("Второй массив: ");
        printArray(array2);

        int[] sumArrays = addArrays(array1, array2);
        System.out.print("Сумма массивов: ");
        printArray(sumArrays);
    }
}