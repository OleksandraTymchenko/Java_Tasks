package com.alex.task05_03;
import java.util.Arrays;

public class Homework05Task03 {
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

    static int[] changeArray(int[] arr) {
        int[] array = new int[arr.length];
        int avgNum;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        avgNum = result / arr.length;
        int count = 0;
        for (int i : arr) {
            if (i > avgNum){
                array[count] = i;
                count ++;
            }
        }
        int[] newArray = Arrays.copyOf(array, count);
        return newArray;
    }
        public static void main(String[] args) {
            int[] array = creatArray(5);
            System.out.println("Исходный массив");
            printArray(array);

            int [] newArray = changeArray(array);
            System.out.println("Массив числа которого больше среднего значения");
            printArray(newArray);

        }
    }