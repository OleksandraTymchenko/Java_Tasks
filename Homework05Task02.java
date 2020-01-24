package com.alex.task05_02;
import java.util.Arrays;

public class Homework05Task02 {

    static int[] creatArray(int x) {
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        return array;
    }

    static int[] printArray(int[] arr) {
        int[] array = new int[arr.length];
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return array;
    }

    static int[][] splitArray(int[] arr) {
        int[] posArr = new int[arr.length];
        int[] negArr = new int[arr.length];
        int posCount = 0;
        int negCount = 0;
        for (int i : arr) {
            if (i > 0){
                posArr[posCount] = i;
                posCount++;
            } else {
                negArr[negCount] = i;
                negCount++;
            }
        }
        int[] posArray = Arrays.copyOf(posArr, posCount);
        int[] negArray = Arrays.copyOf(negArr, negCount);
        int[][] arrays = new int[][]{posArray, negArray};

        return arrays;
    }

    static int[][] printSplitArray(int[][]arr){
        int[][] arrays = new int[arr.length][];
        for(int[] row: arr){
            for(int element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] array1 = creatArray(5);
        int[][] splitArrays = splitArray(array1);

        printSplitArray(splitArrays);

    }
}
